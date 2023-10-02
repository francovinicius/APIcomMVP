package com.simpletask.apicommvp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitService {

    fun recuperarJsonPlace():JsonPlaceAPI {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory( GsonConverterFactory.create() )
            .build()
            .create(JsonPlaceAPI::class.java)
    }
}