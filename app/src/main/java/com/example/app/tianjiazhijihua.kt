package com.example.app

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.tianjiazhijihua.*
import java.security.acl.Group
import android.content.Context
import android.widget.Toast

class tianjiazhijihua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tianjiazhijihua)
        val Groupnumber=GroupNumber.text.toString().toInt()
        val number=Number.text.toString().toInt()
        val date="2.11"
        val Name=textView36.text.toString()
        val ExePlan1 = ContentValues().apply {

            put("ExeName", Name)
            put("GroupNumber", Groupnumber)
            put("Number", number)
            put("Date",date)

        }
        button13.setOnClickListener {
            val dbHelper = Dietplan(this, "food.db", 1)
            val db = dbHelper.writableDatabase
            db.insert("ExercisePlan", null, ExePlan1)
            Toast.makeText(this, "Create succeeded", Toast.LENGTH_SHORT).show()
        }



    }
}