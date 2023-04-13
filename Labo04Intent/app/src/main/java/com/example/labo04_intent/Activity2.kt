package com.example.labo04_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    private lateinit var TextViewNombre: TextView
    private lateinit var TextViewCorreo: TextView
    private lateinit var TextViewNumero: TextView
    private lateinit var ButtonCompartir: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        bind()

        val Nombre = intent.getStringExtra("Nombre").toString()
        val Correo = intent.getStringExtra("Correo").toString()
        val Numero = intent.getStringExtra("Numero").toString()

        TextViewNombre.text = Nombre
        TextViewCorreo.text = Correo
        TextViewNumero.text = Numero
    }


    private fun bind(){
        TextViewNombre= findViewById(R.id.textViewNombre)
        TextViewCorreo = findViewById(R.id.textViewCorreo)
        TextViewNumero = findViewById(R.id.textViewNumero)
        ButtonCompartir = findViewById(R.id.buttonCompartir)
    }


}