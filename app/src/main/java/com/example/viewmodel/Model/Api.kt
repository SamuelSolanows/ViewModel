package com.example.viewmodel.Model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    private val builder =
        Retrofit.Builder().baseUrl("http://192.168.101.9:4600/api/")
            .addConverterFactory(GsonConverterFactory.create()).build()

    var build= builder.create(Llamadas::class.java)
}