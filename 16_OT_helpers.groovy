import nl.jnc.gateway.message.dto.MessageContent
import nl.jnc.gateway.message.dto.MessageHeader

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.json.JsonBuilder

result = 'LETS GO\n'

payloadObject = new JsonSlurper().parseText(payloadAsAttachment().data)

map = [:]

// Iterate over each user in the parsed JSON object and print the UUID
result += '____________ Iterate over users _________\n'
payloadObject.users.each { user ->
    userAddress = getUserData(user, 'get_user_address')
    user.address = userAddress
    userJob = getUserData(user, 'get_user_job')
    user.job = userJob

    map.put(user.uuid, user)
}

return JsonOutput.toJson(map)

//________  FUNCTIONS ________

Object getUserData(user, type) {
  result <<= '\t\t\t- get ' + type + '.... '
  def json = new JsonBuilder()
  json    user:  user

  messageContent = new MessageContent()
  messageContent.setRawContent(json.toString().getBytes())
  groovyMessageHeaders = newMessageHeader(messageContent)
  addHeader(groovyMessageHeaders, 'action', type)

  try {
    att = deliveryPointAttachment(groovyMessageHeaders, messageContent, HELPER_EXITPOINT)
  } catch (e) {
    result <<= 'failed: ' + e.getMessage() + '\n'
    return null
  }

  object = new JsonSlurper().parseText(att.data)
  result <<= 'done\n'
  return object
}

/**
 * Add header to messageHeader
 **/
void addHeader(MessageHeader messageHeader, String name, String value) {
  // Bijhouden action om te gebruiken in de exception handler
  if (name == 'helper_action') {
    current_action = value
  }
  messageHeader.transportParameters.addHeader(name, value)
}

/**
 * create a new messageHeader
 **/
MessageHeader newMessageHeader(MessageContent content) {
  groovyMessageHeaders = new MessageHeader()
  groovyMessageHeaders.copySourceHeaderSubrequest(messageheader, false)
  groovyMessageHeaders.setMessageContent(content)
  groovyMessageHeaders.setSourceMimeType(content.getMimeType())
  groovyMessageHeaders.transportParameters = new nl.jnc.core.common.Headers(true)
  return groovyMessageHeaders
}
