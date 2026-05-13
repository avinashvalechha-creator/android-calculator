package com.example.calc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvDisplay: TextView
    private val helper = CalcHelper() // Java class usage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplay = findViewById(R.id.tvDisplay)
        
        // This is a boilerplate to demonstrate Kotlin logic
        tvDisplay.text = helper.getGreeting()
    }
}
