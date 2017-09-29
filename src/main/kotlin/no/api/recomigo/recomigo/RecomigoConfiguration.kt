package no.api.recomigo.recomigo

import no.api.recomigo.recomigo.services.ElasticService
import org.apache.http.HttpHost
import org.elasticsearch.client.RestClient
import org.elasticsearch.client.RestHighLevelClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RecomigoConfiguration(@Value("\${elasticsearch.index}") val index: String){

    @Bean
    fun elasticService() : ElasticService {
        val lowLevelRestClient = RestClient.builder(
                HttpHost("localhost", 9200, "http"),
                HttpHost("localhost", 9201, "http")).build()

        val client = RestHighLevelClient(lowLevelRestClient)
        return ElasticService(client, index)
    }
}