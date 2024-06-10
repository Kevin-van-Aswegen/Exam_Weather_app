package com.example.examweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class Detailed_Monday_Screen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_monday_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backButton = findViewById<Button>(R.id.backButton)
        val conditions = findViewById<TextView>(R.id.setCondition)
        val maxValue = findViewById<TextView>(R.id.maxvaltextView)
        val minValue = findViewById<TextView>(R.id.minvaltextView)

        val maxTemp = intent.getStringExtra("maxTemp")
        val minTemp = intent.getStringExtra("minTemp")

        maxValue.text = ""+maxTemp+""
        minValue.text = ""+minTemp+""

        backButton.setOnClickListener{
            intent = Intent(this, Main_Screen::class.java)
            startActivity(intent)
        }

        val conditionsArray = arrayListOf("Sunny", "Cloudy", "Rain")
        conditions.text = conditionsArray.random()

    }
}