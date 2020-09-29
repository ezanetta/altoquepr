package com.ezanetta.altoquepr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var petMeButton: Button
    private lateinit var likeButton: Button
    private lateinit var shareButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        setListeners()
    }

    private fun bindViews() {
        petMeButton = findViewById(R.id.pet_me)
        likeButton = findViewById(R.id.like)
        shareButton = findViewById(R.id.share)
    }

    private fun setListeners() {
        petMeButton.setOnClickListener {
            Toast.makeText(this, "Pet me button clicked", Toast.LENGTH_SHORT).show()
        }

        likeButton.setOnClickListener {
            Toast.makeText(this, "Like button clicked", Toast.LENGTH_SHORT).show()
        }

        shareButton.setOnClickListener {
            Toast.makeText(this, "Share button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}