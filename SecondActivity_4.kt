package com.example.image_view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity_4 : AppCompatActivity() {
    private lateinit var buttonBTNSA4: Button
    private lateinit var imageViewSA4: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second4)

        buttonBTNSA4 = findViewById(R.id.buttonBTNSA4)
        imageViewSA4 = findViewById(R.id.imageViewSA4)

        buttonBTNSA4.setOnClickListener {
            val intent = Intent(this, SecondActivity_5::class.java)
            startActivity(intent)
            finish()
        }

    }
}