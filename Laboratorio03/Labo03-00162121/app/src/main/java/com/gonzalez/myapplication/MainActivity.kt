package com.gonzalez.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    private lateinit var imgFiveCents: ImageView
    private lateinit var imgTenCents: ImageView
    private lateinit var imgQuarter: ImageView
    private lateinit var imgOneDollar: ImageView
    private lateinit var txtCantidad: TextView

    var suma = 0.00
    val fiveCents = 0.05
    val tenCents = 0.10
    val quarter = 0.25
    val oneDollar = 1.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        ClickListeners()
    }

    private fun bind() {
        imgFiveCents = findViewById(R.id.imgFiveCents)
        imgTenCents = findViewById(R.id.imgTenCents)
        imgQuarter = findViewById(R.id.imgQuarter)
        imgOneDollar = findViewById(R.id.imgOneDollar)
        txtCantidad = findViewById(R.id.txtCantidad)
    }

    private fun ClickListeners() {
        imgFiveCents.setOnClickListener {
            suma += fiveCents

            val roundoff = String.format("%.2f", suma)
            txtCantidad.text = roundoff
        }

        imgTenCents.setOnClickListener {
            suma += tenCents

            val roundoff = String.format("%.2f", suma)
            txtCantidad.text = roundoff
        }

        imgQuarter.setOnClickListener {
            suma += quarter

            val roundoff = String.format("%.2f", suma)
            txtCantidad.text = roundoff
        }

        imgOneDollar.setOnClickListener {
            suma += oneDollar

            val roundoff = String.format("%.2f", suma)
            txtCantidad.text = roundoff
        }
    }
}