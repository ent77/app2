package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class BodyCheckup_plan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body_checkup_plan)
        val dbHelper = Dietplan(this, "food.db", 3)
        val db = dbHelper.writableDatabase
        // 查询Book表中所有的数据
        val cursor = db.query("ExercisePlan", null, null, null, null, null, null)
        if (cursor.moveToFirst()) {
            do {


                val exename = cursor.getString(cursor.getColumnIndexOrThrow("ExeName"))
                val exedate = cursor.getString(cursor.getColumnIndexOrThrow("Date"))
                val exegroupnumber = cursor.getInt(cursor.getColumnIndexOrThrow("GroupNumber"))
                val exenumber = cursor.getInt(cursor.getColumnIndexOrThrow("Number"))

                Log.d("BodyCheckup_plan", "exename name is $exename")
                Log.d("BodyCheckup_plan", "exedate author is $exedate ")
                Log.d("BodyCheckup_plan", "exegroupnumber is $exegroupnumber")
                Log.d("BodyCheckup_plan", "exenumber is $exenumber")

            } while (cursor.moveToNext())
        }
        cursor.close()

    }
}