package com.nikifovadim.converterpi

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var output = findViewById<TextView>(R.id.userOutput)
        var userInput = findViewById<TextView>(R.id.userInput)
        var btn_Button = findViewById<Button>(R.id.button)

        btn_Button.setOnClickListener {
            var userText = userInput.text.toString().toLowerCase()
            var pi = Math.PI.toString().toLowerCase().subSequence(0, 4)
            if (pi.equals(userText))
            {
                var reversedInput = userText.reversed()
                output.text = reversedInput
                output.setTextColor(Color.parseColor("#00FF00"))
            } else {
                output.text = "Incorrect number PI"
                output.setTextColor(Color.parseColor("#FF0000"))
            }
        }
    }
}