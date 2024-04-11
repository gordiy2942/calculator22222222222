package com.example.calculator22222222222

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator22222222222.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val one : Button = findViewById(R.id.button_1)
        one.setOnClickListener {
            val input: TextView = findViewById(R.id.input)
            input.text = "1" }

        val two : Button = findViewById(R.id.button_2)
        one.setOnClickListener {
            val input: TextView = findViewById(R.id.input)
            input.text = "2"



        }
    }
}