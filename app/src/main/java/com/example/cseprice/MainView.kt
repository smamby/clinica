package com.example.cseprice

import com.example.cseprice.data.Doctor
import com.example.cseprice.data.Paciente

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_view)

        // inicializacion de base de datos
        var paciente: Paciente = Paciente("jjj77","hg#gR","Jose", "Ruiz", "112222",
                                    "jose@gmail.com", "5455555555",
                                "Junin 123 2", 111)
        var doctor: Doctor = Doctor("mmstr2","fref","Marta", "Castro", "112222",
            "jose@gmail.com", "5455555555",
            "Junin 123 2", 33, "EF567")

        Log.i("modulo1", "Paciente: ${paciente.username}, ${paciente.nombre}, ${paciente.apellido}, ${paciente.dni}, ${paciente.email}, ${paciente.nroPac}")
        Log.i("modulo1", "Doctor: ${doctor.username}, ${doctor.nombre}, ${doctor.apellido}, ${doctor.dni}, ${doctor.email}, ${doctor.nroDoc}, ${doctor.matricula}")
    }
}