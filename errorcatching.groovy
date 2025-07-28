try {
    def input = new groovy.json.JsonSlurper().parseText(message.getBody(String))
    assert input.status == "SUCCESS"
} catch (Exception e) {
    message.setBody("{\"status\":\"FAILED\", \"reason\":\"${e.message}\"}")
}
return message
