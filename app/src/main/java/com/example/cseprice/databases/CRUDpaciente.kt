package com.example.cseprice.databases

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.cseprice.data.Paciente

val Paciente = "Paciente"

class CRUDpac (contexto: Context): SQLiteOpenHelper(contexto, Paciente, null,1){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("drop table if exists Paciente")
        db?.execSQL("create table Paciente(nroPac INTEGER PRIMARY KEY AUTOINCREMENT," +
                " username VARCHAR(16), password VARCHAR(16), nombre VARCHAR(30), apellido VARCHAR(30), " +
                "dni VARCHAR(10), email VARCHAR(30), domicilio VARCHAR(30), telefono VARCHAR(30))")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
    fun buscarUno(name:String): Paciente {
        var pac = Paciente();
        val db = this.readableDatabase
        db.execSQL("SELECT * FROM Paciente where username == '${name}'")

        return pac
    }
    fun buscarUno(nroPac:Int){

    }
}