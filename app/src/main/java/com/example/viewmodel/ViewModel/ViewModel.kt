package com.example.viewmodel.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewmodel.Model.Api
import com.example.viewmodel.Model.Entidades.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewModel : ViewModel() {
    val viewmodel: MutableLiveData<MutableList<Usuario>> = MutableLiveData(mutableListOf<Usuario>())

    fun Getviewmodel(): LiveData<MutableList<Usuario>> {
        return viewmodel
    }


    fun MostrarUsuarios() {
        Api.build.GetAllUsuario().enqueue(object : Callback<List<Usuario>> {
            override fun onResponse(call: Call<List<Usuario>>, response: Response<List<Usuario>>) {
               var usuario=response.body()
                viewmodel.postValue(usuario!!.toMutableList())
            }

            override fun onFailure(call: Call<List<Usuario>>, t: Throwable) {
                viewmodel.postValue(mutableListOf())
            }
        })
    }

}