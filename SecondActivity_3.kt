package com.example.image_view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity_3 : AppCompatActivity() {
    private lateinit var buttonBTNSA3: Button
    private lateinit var imageViewSA3: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second3)

        buttonBTNSA3 = findViewById(R.id.buttonBTNSA3)
        imageViewSA3 = findViewById(R.id.imageViewSA3)

        buttonBTNSA3.setOnClickListener {
            val intent = Intent(this, SecondActivity_4::class.java)
            startActivity(intent)
            finish()
        }

    }
}