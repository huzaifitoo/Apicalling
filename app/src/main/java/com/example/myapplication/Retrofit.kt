package com.example.myapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {

     private lateinit var retrofit: Retrofit

    fun getClient() : Retrofit {
        retrofit = Retrofit
            .Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit
    }
}