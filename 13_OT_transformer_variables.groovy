import groovy.json.JsonOutput

// Convert the groovy object to JSON string
// this way you see all available data

return JsonOutput.toJson(this)

//Do not add dependencies other than exitpoint or the script will fail
