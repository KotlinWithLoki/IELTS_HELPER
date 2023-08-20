package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.blogspot.atifsoftwares.animatoolib.Animatoo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val part1 = findViewById<Button>(R.id.part1)
        val part2 = findViewById<Button>(R.id.part2)
        val part3 = findViewById<Button>(R.id.part3)
        val stopwatch = findViewById<Button>(R.id.stopwatch)

        part1.setOnClickListener {
            val intent = Intent(this, Part1::class.java).setAction("your.custom.action")
            startActivity(intent)
            Animatoo.animateSlideLeft(this)
        }
        part2.setOnClickListener {
            Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show()
        }
        part3.setOnClickListener {
            Toast.makeText(this, "Coming soon...", Toast.LENGTH_SHORT).show()
        }
        stopwatch.setOnClickListener {
            val intent = Intent(this, Stopwatch::class.java).setAction("your.custom.action")
            startActivity(intent)
            Animatoo.animateSlideUp(this)
        }

    }
}