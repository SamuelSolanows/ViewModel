package com.example.viewmodel.Model

import com.example.viewmodel.Model.Entidades.Usuario
import retrofit2.Call
import retrofit2.http.GET

interface Llamadas {
    @GET("Usuario")
    fun GetAllUsuario():Call<List<Usuario>>

    @GET("api/Usuario/2")
    fun GetUsuario():Call<Usuario>
}