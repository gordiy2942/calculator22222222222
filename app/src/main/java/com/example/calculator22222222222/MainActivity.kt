package com.example.calculator22222222222

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator22222222222.R
import com.example.calculator22222222222.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val one: Button = binding.button1
        one.setOnClickListener {
            val input: TextView = binding.input
           input.text = "1"
        }

        val two : Button = binding.button2
        two.setOnClickListener {
            val input: TextView = binding.input
            input.text = "2"
        }

        val three : Button = binding.button3
        three.setOnClickListener {
            val input: TextView = binding.input
            input.text = "3"
        }

        val four : Button = binding.button4
        four.setOnClickListener {
            val input: TextView = binding.input
            input.text = "4"
        }

        val five : Button = binding.button5
        five.setOnClickListener {
            val input: TextView = binding.input
            input.text = "5"
        }

        val six : Button = binding.button6
        six.setOnClickListener {
            val input: TextView = binding.input
            input.text = "6"
        }

        val seven : Button = binding.button7
        seven.setOnClickListener {
            val input: TextView = binding.input
            input.text = "7"
        }

        val eight : Button = binding.button8
        eight.setOnClickListener {
            val input: TextView = binding.input
            input.text = "8"
        }

        val nine : Button = binding.button9
        nine.setOnClickListener {
            val input: TextView = binding.input
            input.text = "9"
        }

        val clear : Button = binding.buttonC
        clear.setOnClickListener {
            val input: TextView = binding.input
            input.text = ""
        }

        val plus : Button = binding.buttonPlus
        plus.setOnClickListener {
            val input: TextView = binding.input
            input.text = "+"
        }

        val minus : Button = binding.buttonMinus
        minus.setOnClickListener {
            val input: TextView = binding.input
            input.text = "-"
        }

        val multiply : Button = binding.buttonMultiply
        multiply.setOnClickListener {
            val input: TextView = binding.input
            input.text = "*"
        }

        val devide : Button = binding.buttonDevide
        devide.setOnClickListener {
            val input: TextView = binding.input
            input.text = ":"
        }

        val point : Button = binding.buttonPoint
        point.setOnClickListener {
            val input: TextView = binding.input
            input.text = "."
        }

        val okey : Button = binding.buttonOK
        okey.setOnClickListener {
            val input: TextView = binding.input
        }



    }
}