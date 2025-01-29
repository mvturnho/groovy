import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.json.JsonBuilder

/*
  Importing JSON Classes:
  - JsonOutput: Used for converting Groovy objects into JSON strings.
  - JsonSlurper: Used for parsing JSON strings into Groovy objects.
  - JsonBuilder: Used for constructing JSON objects in a Groovy-friendly way.
*/

/*
    In this example, we use the JsonSlurper class to parse a JSON payload.
    The payloadAsAttachment() method is a standard opentunnel method that is available in groovy and freemarker.
    The data property return the JSON string.
    The parseText method parses the JSON string into a Groovy object.
*/
payloadObject = new JsonSlurper().parseText(payloadAsAttachment().data)

/*
  In this example, we use the JsonSlurper class to parse a JSON payload.
  The payloadAsAttachment() method is assumed to return an object with a data property containing the JSON string.
  The parseText method parses the JSON string into a Groovy object.
*/

map = new HashMap()


// Iterate over each user in the parsed JSON object and print the UUID
payloadObject.users.each { user ->
    map.put(user.uuid, user)
}

/*
  The users property of the parsed JSON object is a list of user objects.
  We use the each method to iterate over each user in the list and print the UUID of each user.
*/

return JsonOutput.toJson(map)

/*
  The script returns null at the end, which is optional and can be omitted.
*/