package com.example.cseprice.data


class Paciente (
    username: String,
    clave: String,
    nombre: String,
    apellido: String,
    dni: String,
    email: String,
    telefono: String,
    domicilio: String,
    nroPac:Int
) : Usuario(username, clave, nombre, apellido, dni, email, telefono, domicilio) {
    var nroPac: Int = nroPac
}