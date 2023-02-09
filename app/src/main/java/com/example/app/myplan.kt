package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_myplan.*

class myplan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myplan)
        supportActionBar?.hide()
        val dbHelper = Dietplan(this, "food.db", 1)
        imageButton6.setOnClickListener {
            dbHelper.writableDatabase
        }
    }
}