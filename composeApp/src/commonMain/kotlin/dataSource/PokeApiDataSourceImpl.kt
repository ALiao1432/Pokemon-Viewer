package dataSource

import io.ktor.client.HttpClient

class PokeApiDataSourceImpl(
    private val httpClient: HttpClient,
) : PokeApiDataSource {
    override fun getPokemon(): String {
        return "Pikachu"
    }
}
