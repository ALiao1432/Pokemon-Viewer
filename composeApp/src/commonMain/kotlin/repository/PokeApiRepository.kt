package repository

import dataSource.PokeApiDataSource

class PokeApiRepository(
    private val pokeApiDataSource: PokeApiDataSource,
) {
    fun getPokemon(): String {
        return pokeApiDataSource.getPokemon()
    }
}
