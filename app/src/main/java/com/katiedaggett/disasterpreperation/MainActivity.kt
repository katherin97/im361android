package com.katiedaggett.disasterpreperation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstVal = 1
        val finalNumber = firstNumber(firstVal)

        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = "The number is $finalNumber"
    }

    fun firstNumber(num: Int): Int {
        var finalNumb = num
        var first = 3
        var second = 5
        var final = 0

        while (finalNumb >= 0) {
            final = first * second
            finalNumb--
        }
        return final
    }



}
