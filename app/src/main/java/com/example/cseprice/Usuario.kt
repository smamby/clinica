package com.example.cseprice

open class Usuario {
    var username:String = ""
    var clave:String = ""
    var nombre:String = ""
    var apellido:String = ""
    var dni:String = ""
    var email:String =""
    var telefono:String = ""
    var domicilio:String = ""

    constructor(
        username:String,
        clave:String,
        nombre: String,
        apellido: String,
        dni: String,
        email: String,
        telefono: String,
        domicilio: String
    ) {
        this.username = username
        this.clave = clave
        this.nombre = nombre
        this.apellido = apellido
        this.dni = dni
        this.email = email
        this.telefono = telefono
        this.domicilio = domicilio
    }
}