package viewModel

import androidx.lifecycle.ViewModel
import repository.PokeApiRepository

class MainViewModel(
    private val pokeApiRepository: PokeApiRepository,
) : ViewModel() {
    fun testGetPokemon(): String {
        return pokeApiRepository.getPokemon()
    }
}
