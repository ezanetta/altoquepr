package com.ezanetta.altoquepr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showEvenNumbers()
    }

    private fun showEvenNumbers() {
        Log.d(
            "Numbers",
            "Even numbers: ${filterEvenNumbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))}"
        )
    }
}