package com.example.clickergameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var clicks = 0
        val perClick = 1
        val button = findViewById<ImageButton>(R.id.pointButton)
        val score = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show()
            clicks += perClick
            score.text=clicks.toString()
        }
    }
}