package com.example.viewmodel.Model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    private val builder =
        Retrofit.Builder().baseUrl("http://192.168.1.249:4600/api/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    var build= builder.create(Llamadas::class.java)
}