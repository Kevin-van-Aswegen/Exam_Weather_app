package com.example.examweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val exitbutton = findViewById<Button>(R.id.exitApp)
        val nextbutton = findViewById<Button>(R.id.nextScreenbutton)

        val intent = getIntent()

        exitbutton.setOnClickListener{

            finishAffinity()

        }

        nextbutton.setOnClickListener{

            val intent = Intent(this, Main_Screen::class.java)
            startActivity(intent)

        }
    }
}