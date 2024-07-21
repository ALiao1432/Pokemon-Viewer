package com.redso.pokemonviewer

import android.app.Application
import di.initKoin
import org.koin.android.ext.koin.androidContext

class PokeApp: Application() {
    override fun onCreate() {
        super.onCreate()
         initKoin {
             androidContext(this@PokeApp)
         }
    }
}
