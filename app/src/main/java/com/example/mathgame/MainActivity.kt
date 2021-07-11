package com.example.mathgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    lateinit var tv1: TextView
    lateinit var et1: EditText
    var res = 0
    var number1 = 0
    var number2 = 0
    var max = 20
    var min = 0
    var max2 = 4
    var min2 = 0
    var UserAnswer = 0

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.textView)
        et1 = findViewById(R.id.editText)
        numbers()
    }

    fun numbers() {
        var text = ""
        tv1.setText(text)
        number1 = (Math.random() * (max - min)).toInt()
        number2 = (Math.random() * (max - min)).toInt()
        var amal = (Math.random() * (max2 - min2)).toInt()

        when (amal) {
            0 -> {
                tv1.text = "$number1 + $number2 = "
                res = number1 + number2
            }
            1 -> {
                tv1.text = "$number1 - $number2 = "
                res = number1 - number2
            }
            2 -> {
                tv1.text = "$number1 * $number2 = "
                res = number1 * number2
            }
            3 -> {
                try {
                    if (number1 / number2 != 0) throw Exception()
                    tv1.text = "xato"

                    tv1.text = "$number1 / $number2 = "
                    res = number1 / number2
                } catch (e: Exception) {
                    numbers() } } } }


    fun res(view: View) {

        try {
            UserAnswer = et1.text.toString().toInt()
            if (res == UserAnswer) {
                Toast.makeText(this, "True", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, "False", Toast.LENGTH_LONG).show()
            }
        } catch (e: Exception) {
            Toast.makeText(this, "numbers", Toast.LENGTH_LONG).show()
        }
        numbers()
    }
}