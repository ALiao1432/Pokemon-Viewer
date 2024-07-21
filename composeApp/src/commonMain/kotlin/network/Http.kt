package network

import helper.ConfigHelper
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

object Http {
    private const val IS_DEBUG = true

    @OptIn(ExperimentalSerializationApi::class)
    val httpClient =
        HttpClient {
            install(HttpTimeout) {
                connectTimeoutMillis = ConfigHelper.TIMEOUT
                requestTimeoutMillis = ConfigHelper.TIMEOUT
            }
            install(ContentNegotiation) {
                json(
                    Json {
                        prettyPrint = true
                        isLenient = true
                        ignoreUnknownKeys = true
                        explicitNulls = false
                        coerceInputValues = true
                    },
                )
            }
        }
}
