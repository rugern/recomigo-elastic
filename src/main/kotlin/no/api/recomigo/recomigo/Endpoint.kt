package no.api.recomigo.recomigo

import org.springframework.stereotype.Component
import javax.ws.rs.GET
import javax.ws.rs.Path

@Component
@Path("/")
class Endpoint {

    @GET
    fun message(): String {
        return "Hello world!"
    }

}
