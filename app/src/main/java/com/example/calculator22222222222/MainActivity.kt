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
        val input  = binding.input


        val one = binding.button1
        one.setOnClickListener {
            input.text = input.text.toString() + one.text.toString()
        }

        val two = binding.button2
        two.setOnClickListener {
            input.text = input.text.toString() + two.text.toString()
        }

        val three = binding.button3
        three.setOnClickListener {
            input.text = input.text.toString() + three.text.toString()
        }

        val four = binding.button4
        four.setOnClickListener {
            input.text = input.text.toString() + four.text.toString()
        }

        val five = binding.button5
        five.setOnClickListener {
            input.text = input.text.toString() + five.text.toString()
        }

        val six = binding.button6
        six.setOnClickListener {
            input.text = input.text.toString() + six.text.toString()
        }

        val seven = binding.button7
        seven.setOnClickListener {
            input.text = input.text.toString() + seven.text.toString()
        }

        val eight = binding.button8
        eight.setOnClickListener {
            input.text = input.text.toString() + eight.text.toString()
        }

        val nine = binding.button9
        nine.setOnClickListener {
            input.text = input.text.toString() + nine.text.toString()
        }

        val clear = binding.buttonC
        clear.setOnClickListener {
            binding.input.text = ""
        }

        val plus = binding.buttonPlus
        plus.setOnClickListener {
            input.text = input.text.toString() + plus.text.toString()
        }

        val minus = binding.buttonMinus
        minus.setOnClickListener {
            input.text = input.text.toString() + minus.text.toString()
        }

        val multiply = binding.buttonMultiply
        multiply.setOnClickListener {
            input.text = input.text.toString() + multiply.text.toString()
        }

        val devide = binding.buttonDevide
        devide.setOnClickListener {
            input.text = input.text.toString() + devide.text.toString()
        }

        val point = binding.buttonPoint
        point.setOnClickListener {
            input.text = input.text.toString() + point.text.toString()
        }

        val okey = binding.buttonOK
        okey.setOnClickListener {
            input.text = input.text.toString() + okey.text.toString()
        }



    }
}