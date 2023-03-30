package com.gonzalez.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.math.RoundingMode
import java.text.DecimalFormat

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

            var df = DecimalFormat("#.###")
            df.roundingMode = RoundingMode.UNNECESSARY
            var round = df.format(suma).toDouble()

            txtCantidad.text = round.toString()
        }

        imgTenCents.setOnClickListener {
            suma += tenCents

            var df = DecimalFormat("#.###")
            df.roundingMode = RoundingMode.UNNECESSARY
            var round = df.format(suma).toDouble()

            txtCantidad.text = round.toString()
        }

        imgQuarter.setOnClickListener {
            suma += quarter

            var df = DecimalFormat("#.###")
            df.roundingMode = RoundingMode.UNNECESSARY
            var round = df.format(suma).toDouble()

            txtCantidad.text = round.toString()
        }

        imgOneDollar.setOnClickListener {
            suma += oneDollar

            var df = DecimalFormat("#.###")
            df.roundingMode = RoundingMode.UNNECESSARY
            var round = df.format(suma).toDouble()

            txtCantidad.text = round.toString()
        }
    }
}