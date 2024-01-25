package com.example.clickergameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        var perClick = 1
        val button = findViewById<ImageButton>(R.id.pointButton)
        val upButton = findViewById<Button>(R.id.upgradeButton)
        val score = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show()
            clicks += perClick
            score.text=clicks.toString()
            if(clicks>=100){
                upButton.visibility = View.VISIBLE
            }
        }
        upButton.setOnClickListener{
            clicks -= 100
            perClick+=1
        }
    }
}