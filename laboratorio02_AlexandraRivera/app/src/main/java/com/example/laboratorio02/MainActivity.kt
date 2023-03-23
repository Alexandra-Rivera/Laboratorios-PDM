package com.example.laboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var bmiTextView: TextView
    private lateinit var weightEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var btnCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()

        btnCalculate.setOnClickListener{
            val weight = weightEditText.toString()
            val height = heightEditText.toString()

            val bmi = weight.toFloat() / (height.toFloat() * height.toFloat())

            bmiTextView.text = bmi.toString()
        }
    }

    private fun bind(){
        weightEditText = findViewById(R.id.weightEditText)
        heightEditText = findViewById(R.id.heightEditText)
        btnCalculate = findViewById(R.id.btnCalculate)
        bmiTextView = findViewById(R.id.bmitextView)
    }

}