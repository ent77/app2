package com.example.app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class foodrecord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodrecord)
        supportActionBar?.hide()
        val dbHelper = Dietplan(this, "food.db", 3)
        val db = dbHelper.writableDatabase
        // 查询Book表中所有的数据
        val cursor = db.query("food", null, null, null, null, null, null)
        if (cursor.moveToFirst()) {
            do {


                val name = cursor.getString(cursor.getColumnIndexOrThrow("foodName"))
                val perenergy = cursor.getInt(cursor.getColumnIndexOrThrow("foodperEnergy"))
                val introdunction = cursor.getInt(cursor.getColumnIndexOrThrow("foodIntruduction"))

                Log.d("foodrecord", "food name is $name")
                Log.d("foodrecord", "foodperEnergy author is $perenergy ")
                Log.d("foodrecord", "foodIntruduction is $introdunction")

            } while (cursor.moveToNext())
        }
        cursor.close()

    }
}