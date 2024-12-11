package com.example.image_view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity_2 : AppCompatActivity() {
    private lateinit var buttonBTNSA2:Button
    private lateinit var imageViewSA2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second2)

        buttonBTNSA2 = findViewById(R.id.buttonBTNSA2)
        imageViewSA2 = findViewById(R.id.imageViewSA2)

        buttonBTNSA2.setOnClickListener {
            val intent = Intent(this, SecondActivity_3::class.java)
            startActivity(intent)
            finish()

        }

    }
}