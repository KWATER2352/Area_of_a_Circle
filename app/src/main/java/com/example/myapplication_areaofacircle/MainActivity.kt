package com.example.myapplication_areaofacircle

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rad: EditText = findViewById(R.id.rad)
        val sol: EditText = findViewById(R.id.Solution)
        val solve: Button = findViewById(R.id.Solve)

        solve.setOnClickListener() {
            val inputTxt = rad.text.toString()

            if (inputTxt.isNotEmpty()) {
                val makeItDouble = inputTxt.toDouble()
                val squareItUp = makeItDouble * makeItDouble
                val result = squareItUp * Math.PI
                sol.setText(result.toString())
            }

        }


    }

    }





