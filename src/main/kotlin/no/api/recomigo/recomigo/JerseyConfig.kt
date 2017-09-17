package no.api.recomigo.recomigo

import org.glassfish.jersey.server.ResourceConfig

import org.springframework.stereotype.Component

@Component
class JerseyConfig : ResourceConfig() {
    init {
        register(Endpoint::class.java)
    }

}