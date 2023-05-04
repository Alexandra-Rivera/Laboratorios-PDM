package com.example.labo04_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var EditTextNombre: EditText
    private lateinit var EditTextCorreo: EditText
    private lateinit var EditTextNumero: EditText
    private lateinit var ButtonGuardar: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        clickListener()
    }

    private fun bind(){
        EditTextNombre = findViewById(R.id.inputEditTextNombre)
        EditTextCorreo = findViewById(R.id.inputEditTextCorreo)
        EditTextNumero = findViewById(R.id.inputEditTextNumero)
        ButtonGuardar = findViewById(R.id.buttonGuardar)
    }

    private fun clickListener(){
        ButtonGuardar.setOnClickListener{
            var intent = Intent(this, Activity2::class.java)
            intent.putExtra("Nombre", EditTextNombre.text.toString())
            intent.putExtra("Correo", EditTextCorreo.text.toString())
            intent.putExtra("Numero", EditTextNumero.text.toString())
            startActivity(intent)
        }
    }


}