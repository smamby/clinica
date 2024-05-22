package com.example.cseprice.data

import android.provider.ContactsContract.CommonDataKinds.Email


class Paciente (
    username: String,
    clave: String,
    nombre: String,
    apellido: String,
    dni: String,
    email: String,
    telefono: String,
    domicilio: String,
    var nroPac:Int
) : Usuario(username, clave, nombre, apellido, dni, email, telefono, domicilio) {


    constructor(): this(
        username="",
        clave="",
        nombre="",
        apellido="",
        dni="",
        email="",
        telefono="",
        domicilio="",
        nroPac=0
    )



}
