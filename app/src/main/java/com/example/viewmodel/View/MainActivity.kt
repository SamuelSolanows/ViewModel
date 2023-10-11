package com.example.viewmodel.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.viewmodel.ViewModel.ViewModel
import com.example.viewmodel.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val viewmodelconexion: ViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodelconexion.viewmodel.observe(this, Observer { list ->
            binding.textView.setText(list.toString())
        })

        viewmodelconexion.MostrarUsuarios()

        binding.btn.setOnClickListener {
            viewmodelconexion.MostrarUsuarios()
        }

    }

//
}