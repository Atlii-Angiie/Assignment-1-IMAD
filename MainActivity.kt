package com.example.imad5112

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputAge = findViewById<EditText>(R.id.inputAge)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtShowResults = findViewById<TextView>(R.id.txtShowResults)
        btnGenerate.setOnClickListener {
            val age=inputAge.text.toString().toIntOrNull()
            if (age !=null) {
              val result=when(age)  {
                  in 20..22->"xxxtentacion"
                  in 23..25->"Unknown"
                  in 26..28->"62Angues Cloud"
                  in 29..31-> "Unknown"
                  in 32..34-> "Tumi Tladi"
                  in 35..37-> "Unknown"
                  in 38..40-> "Ricky Rick"
                  in 41..43-> "Zahara"
                  in 44..46-> "Unknowm"
                  in 47..49-> "Michael Jackson"
                  in 50..61-> "Unknown"
                  in 62..64-> "Mbongeni Ngema"
                  else -> "Error"
              }
            txtShowResults.text=
                when (result) {
                    "xxxtentacion" -> "$result died at that age"
                    "Unknown" -> "$result There is no historical figure for that age"
                    "Angues Cloud" -> "$result died at that age"
                    "Tumi Tladi" -> "$result died at that age"
                    "Ricky Rick" -> "$result died at that age"
                    "Zahara" -> "$result died at that age"
                    "Michael Jackson" -> "$result died at that age"
                    "Mbongeni Ngema" -> "$result died at that age"
                    else -> result
                }
            } else {
                txtShowResults.text = "Please enter a valid age"
            }.toString()
            }
        btnClear.setOnClickListener {
            inputAge.text.clear()
            txtShowResults.text = ""
        }
            }
            }