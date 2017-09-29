package no.api.recomigo.recomigo.restful

import no.api.recomigo.recomigo.services.ElasticService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class Endpoint @Autowired constructor(val elasticService: ElasticService) {

    @RequestMapping(
            value = "/",
            method = arrayOf(RequestMethod.GET),
            produces = arrayOf(MediaType.TEXT_PLAIN_VALUE)
    )
    fun message(): String {
        return "Hello world!"
    }

    @RequestMapping(
            value = "/doc",
            method = arrayOf(RequestMethod.GET),
            produces = arrayOf(MediaType.TEXT_PLAIN_VALUE)
    )
    fun document(): String {
        return elasticService.getDocument()
    }

    @RequestMapping(
            value = "/recommendations/"
    )
}
