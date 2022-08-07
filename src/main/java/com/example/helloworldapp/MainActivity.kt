package com.example.helloworldapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener{
            //Handle button click for text color change
            Log.i("Alexis", "Tapped on button")
            //Get a reference to the text view
            //Then set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }
    }
}