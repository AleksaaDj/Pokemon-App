package com.aleksa.samaritanassignment

import android.app.Application
import com.aleksa.samaritanassignment.network.MainRepository
import com.aleksa.samaritanassignment.network.RetrofitService
import com.aleksa.samaritanassignment.network.RoomPokemonDatabase

class PokemonApplication : Application() {

    private val database by lazy {RoomPokemonDatabase.getDatabase(applicationContext) }
    private val retrofit by lazy {RetrofitService.getInstance()}
    val repository by lazy { MainRepository(retrofit, database) }
}