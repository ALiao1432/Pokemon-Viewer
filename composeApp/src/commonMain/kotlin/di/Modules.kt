package di

import dataSource.PokeApiDataSource
import dataSource.PokeApiDataSourceImpl
import network.Http
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module
import repository.PokeApiRepository
import viewModel.MainViewModel

val shareModule =
    module {
        single { Http.httpClient }

        single { PokeApiDataSourceImpl(get()) }.bind(PokeApiDataSource::class)

        single {
            PokeApiRepository(get())
        }

        viewModel { MainViewModel(get()) }
    }

val platformModule = module { }
