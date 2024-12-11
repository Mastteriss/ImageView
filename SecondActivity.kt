package com.example.image_view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private lateinit var buttonBTNSA: Button
    private lateinit var imageViewSA:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        imageViewSA = findViewById(R.id.imageViewSA)
        buttonBTNSA = findViewById(R.id.buttonBTNSA)


        buttonBTNSA.setOnClickListener {
            val intent = Intent(this, SecondActivity_2::class.java)
            startActivity(intent)
            finish()
        }
    }
}