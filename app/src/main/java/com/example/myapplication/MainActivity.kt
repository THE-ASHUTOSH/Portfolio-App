package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSkill = findViewById<Button>(R.id.skillButton)
        val buttonEducation = findViewById<Button>(R.id.EducationButton)
        val buttonWork = findViewById<Button>(R.id.workButton)
        val buttonAchievement = findViewById<Button>(R.id.achievementButton)

        buttonSkill.setOnClickListener {
            intent = Intent(this,Skills::class.java)
            startActivity(intent)
        }
        buttonEducation.setOnClickListener {
            intent = Intent(this,Education::class.java)
            startActivity(intent)
        }
        buttonWork.setOnClickListener {
            intent = Intent(this,work::class.java)
            startActivity(intent)
        }
        buttonAchievement.setOnClickListener {
            intent = Intent(this,Achievement::class.java)
            startActivity(intent)
        }

    }
}