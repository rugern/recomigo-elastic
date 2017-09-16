package no.api.recomigo.recomigo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class RecomigoApplication

fun main(args: Array<String>) {
    SpringApplication.run(RecomigoApplication::class.java, *args)
}
