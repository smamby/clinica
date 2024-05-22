package com.example.cseprice.data

class Doctor (
    username: String,
    clave:String,
    nombre: String,
    apellido: String,
    dni: String,
    email: String,
    telefono: String,
    domicilio: String,
    nroDoc: Int,
    matricula: String
    ) : Usuario(username, clave, nombre, apellido, dni, email, telefono, domicilio) {
        var nroDoc: Int = nroDoc
        var matricula: String = matricula
}