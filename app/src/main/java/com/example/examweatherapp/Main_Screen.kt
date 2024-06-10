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
import org.w3c.dom.Text

class Main_Screen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backButton = findViewById<Button>(R.id.backButton)

        val monButton = findViewById<Button>(R.id.mondayButton)
        val tueButton = findViewById<Button>(R.id.tuesdayButton)
        val wedButton = findViewById<Button>(R.id.wednesdayButton)
        val thuButton = findViewById<Button>(R.id.thursdayButton)
        val friButton = findViewById<Button>(R.id.fridayButton)
        val satButton = findViewById<Button>(R.id.saturdayButton)
        val sunButton = findViewById<Button>(R.id.sundayButton)

        val monMin = findViewById<TextView>(R.id.mondayMin)
        val monMax = findViewById<TextView>(R.id.mondayMax)

        val tueMin = findViewById<TextView>(R.id.tuesdayMin)
        val tueMax = findViewById<TextView>(R.id.tuesdayMax)

        val wedMin = findViewById<TextView>(R.id.wednesdayMin)
        val wedMax = findViewById<TextView>(R.id.wednesdayMax)

        val thuMin = findViewById<TextView>(R.id.thursdayMin)
        val thuMax = findViewById<TextView>(R.id.thursdayMax)

        val friMin = findViewById<TextView>(R.id.fridayMin)
        val friMax = findViewById<TextView>(R.id.fridayMax)

        val satMin = findViewById<TextView>(R.id.saturdayMin)
        val satMax = findViewById<TextView>(R.id.saturdayMax)

        val sunMin = findViewById<TextView>(R.id.sundayMin)
        val sunMax = findViewById<TextView>(R.id.sundayMax)



        backButton.setOnClickListener {
            val intent = Intent(this, Login_Screen::class.java)
            startActivity(intent)
        }

        val randomMoMin = (0..12).random()
        val randomMoMax = (17..35).random()

        val randomTuMin = (0..12).random()
        val randomTuMax = (17..35).random()

        val randomWeMin = (0..12).random()
        val randomWeMax = (17..35).random()

        val randomThMin = (0..12).random()
        val randomThMax = (17..35).random()

        val randomFrMin = (0..12).random()
        val randomFrMax = (17..35).random()

        val randomSaMin = (0..12).random()
        val randomSaMax = (17..35).random()

        val randomSuMin = (0..12).random()
        val randomSuMax = (17..35).random()

        monMin.text = randomMoMin.toString()
        monMax.text = randomMoMax.toString()

        tueMin.text = randomTuMin.toString()
        tueMax.text = randomTuMax.toString()

        wedMin.text = randomWeMin.toString()
        wedMax.text = randomWeMax.toString()

        thuMin.text = randomThMin.toString()
        thuMax.text = randomThMax.toString()

        friMin.text = randomFrMin.toString()
        friMax.text = randomFrMax.toString()

        satMin.text = randomSaMin.toString()
        satMax.text = randomSaMax.toString()

        sunMin.text = randomSuMin.toString()
        sunMax.text = randomSuMax.toString()

        monButton.setOnClickListener{

            var maxTemp = monMax.text.toString()
            var minTemp = monMin.text.toString()

            intent = Intent (this, Detailed_Monday_Screen::class.java)

            intent.putExtra("maxTemp", maxTemp)
            intent.putExtra("minTemp", minTemp)

            startActivity(intent)
        }

        tueButton.setOnClickListener{

            var maxTemp = tueMax.text.toString()
            var minTemp = tueMin.text.toString()

            intent = Intent (this, Detailed_Tuesday_Screen::class.java)

            intent.putExtra("maxTemp", maxTemp)
            intent.putExtra("minTemp", minTemp)

            startActivity(intent)
        }

        wedButton.setOnClickListener{

            var maxTemp = wedMax.text.toString()
            var minTemp = wedMin.text.toString()

            intent = Intent (this, Detailed_Wednesday_Screen::class.java)

            intent.putExtra("maxTemp", maxTemp)
            intent.putExtra("minTemp", minTemp)

            startActivity(intent)
        }

        thuButton.setOnClickListener{

            var maxTemp = thuMax.text.toString()
            var minTemp = thuMin.text.toString()

            intent = Intent (this, Detailed_Thursday_Screen::class.java)

            intent.putExtra("maxTemp", maxTemp)
            intent.putExtra("minTemp", minTemp)

            startActivity(intent)
        }

        friButton.setOnClickListener{

            var maxTemp = friMax.text.toString()
            var minTemp = friMin.text.toString()

            intent = Intent (this, Detailed_Friday_Screen::class.java)

            intent.putExtra("maxTemp", maxTemp)
            intent.putExtra("minTemp", minTemp)

            startActivity(intent)
        }

        satButton.setOnClickListener{

            var maxTemp = satMax.text.toString()
            var minTemp = satMin.text.toString()

            intent = Intent (this, Detailed_Saturday_Screen::class.java)

            intent.putExtra("maxTemp", maxTemp)
            intent.putExtra("minTemp", minTemp)

            startActivity(intent)
        }

        sunButton.setOnClickListener{

            var maxTemp = sunMax.text.toString()
            var minTemp = sunMin.text.toString()

            intent = Intent (this, Detailed_Sunday_Screen::class.java)

            intent.putExtra("maxTemp", maxTemp)
            intent.putExtra("minTemp", minTemp)

            startActivity(intent)
        }

        val averageMinarray = arrayListOf<TextView>(monMin,tueMin,wedMin,thuMin,friMin,satMin,sunMin)
        val averageMaxarray = arrayListOf<TextView>(monMax,tueMax,wedMax,thuMax,friMax,satMax,sunMax)

        }

}