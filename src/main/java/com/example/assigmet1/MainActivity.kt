package com.example.assigmet1

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

        val submitButton = findViewById<Button>(R.id.subbtn)
        val resetButton = findViewById<Button>(R.id.rebtn)
        val textDisplay = findViewById<TextView>(R.id.outputsgg)
        val input_field = findViewById<EditText>(R.id.inputsggt)

        submitButton.setOnClickListener {

            val my_tm = input_field.text.toString()

            if (my_tm == "morning") {
                textDisplay.text = "Magwinya"
            } else if (my_tm == "afternoon") {
                textDisplay.text = "Kota"
            }else if(my_tm == "evening")
                textDisplay.text = "pap"
        }
        resetButton.setOnClickListener{
            textDisplay.text = ""
            input_field.text.clear()
        }
    }
}