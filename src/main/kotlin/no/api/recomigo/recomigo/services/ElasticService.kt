package no.api.recomigo.recomigo.services

import org.elasticsearch.action.get.GetRequest
import org.elasticsearch.client.RestHighLevelClient
import org.springframework.stereotype.Repository

@Repository
class ElasticService(val client: RestHighLevelClient, val index: String) {

    fun getDocument(): String {
        val req = GetRequest(
                index,
                "json",
                "AV7NQSkDw8mTgG3u6eVS"
        )
        val res = client.get(req)
        var value = "Not found"
        if (res.isExists) {
            value = res.sourceAsString
        }
        return value
    }

}