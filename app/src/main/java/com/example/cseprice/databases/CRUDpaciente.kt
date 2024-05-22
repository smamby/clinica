package com.example.cseprice.databases

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import android.widget.Toast
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
        var db = this.readableDatabase
        var res = db.rawQuery("SELECT * FROM Paciente where username == '${name}'",null)
        pac.username = res.getString(0)
        pac.clave = res.getString(1)
        pac.nombre = res.getString(2)
        pac.apellido = res.getString(3)
        pac.dni = res.getString(4)
        pac.email = res.getString(5)
        pac.telefono = res.getString(6)
        pac.domicilio = res.getString(7)
        pac.nroPac = res.getInt(8)
        return pac
    }
    fun buscarUno(nroPac:Int):Paciente{
        var db = this.readableDatabase
        var res = db.rawQuery("SELECT * FROM Paciente where nroPac == '${nroPac}'",null)
        var pac = Paciente();
        pac.username = res.getString(0)
        pac.clave = res.getString(1)
        pac.nombre = res.getString(2)
        pac.apellido = res.getString(3)
        pac.dni = res.getString(4)
        pac.email = res.getString(5)
        pac.telefono = res.getString(6)
        pac.domicilio = res.getString(7)
        pac.nroPac = res.getInt(8)
        return pac
    }
    fun insertar(paciente: Paciente):Boolean{
        var contenedor = ContentValues()
        var db = this.writableDatabase
        try {
        contenedor.put("username",paciente.username)
        contenedor.put("clave",paciente.clave)
        contenedor.put("nombre",paciente.nombre)
        contenedor.put("apellido",paciente.apellido)
        contenedor.put("dni",paciente.dni)
        contenedor.put("email",paciente.email)
        contenedor.put("telefono",paciente.telefono)
        contenedor.put("domicilio",paciente.domicilio)
        contenedor.put("nroPac",paciente.nroPac)
        var res = db.insert("Paciente",null,contenedor)
        if (res != -1L){
            return true
        }
        } catch (e:Exception) {
            Log.e("clinica","Error al insertar paciente")
            Toast.makeText(this, "Ocurrio un rpoblema al insertar paciente", Toast.LENGTH_SHORT).show()
            return false
        } finally {
            db.close()
        }
        return true
    }
}