package com.example.image_view

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity_5 : AppCompatActivity() {
    private lateinit var buttonBTN5:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second5)

        buttonBTN5 = findViewById(R.id.buttonBTNSA5)

        buttonBTN5.setOnClickListener {
            finish()
        }
    }
}