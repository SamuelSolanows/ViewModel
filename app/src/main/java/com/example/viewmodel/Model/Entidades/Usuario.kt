package com.example.viewmodel.Model.Entidades

data class Usuario(
    val ID: Int,
    val Nombre: String,
    val Apellido: String,
    val Correo: String,
    val Telefono: String,
    val IDSexo: Int
){
    override fun toString(): String {
        return Nombre;
    }
}
