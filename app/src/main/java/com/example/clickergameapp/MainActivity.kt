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
        var clicks = 98
        var perClick = 1
        var clicksNeeded = 100
        val button = findViewById<ImageButton>(R.id.pointButton)
        val upButton = findViewById<Button>(R.id.upgradeButton)
        val score = findViewById<TextView>(R.id.points)
        button.setOnClickListener {
            Toast.makeText(this, perClick.toString(), Toast.LENGTH_SHORT).show()
            clicks += perClick
            score.text=clicks.toString()
            if(clicks>=clicksNeeded){
                upButton.visibility = View.VISIBLE
            }
        }
        upButton.setOnClickListener{
            clicks -= clicksNeeded
            clicksNeeded += 100
            perClick+=1
            if(clicks < clicksNeeded){
                upButton.visibility = View.INVISIBLE
                upButton.text = getString(R.string.you_will_need, clicksNeeded.toString())
            }

        }

    }
}