package com.example.viewmodel.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.viewmodel.Model.Api
import com.example.viewmodel.Model.Entidades.Usuario
import com.example.viewmodel.ViewModel.ViewModel
import com.example.viewmodel.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val viewmodelconexion: ViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            viewmodelconexion.viewmodel.observe(this, Observer {
                binding.textView.append(it.size.toString())
            })
        }



    }

//    private fun ObtenerUsuario() {
//        Api.build.GetAllUsuario().enqueue(object : Callback<List<Usuario>> {
//            override fun onResponse(call: Call<List<Usuario>>, response: Response<List<Usuario>>) {
//                var usuario = response.body()
//                usuario?.forEach { binding.textView.append(it.Nombre) }
//            }
//
//            override fun onFailure(call: Call<List<Usuario>>, t: Throwable) {
//                t.message?.let { Log.e("Error", it) }
//            }
//
//        })
//
//
//    }


}