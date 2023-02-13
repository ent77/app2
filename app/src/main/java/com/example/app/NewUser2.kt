package com.example.app

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.DropBoxManager
import kotlinx.android.synthetic.main.activity_new_user2.*

class NewUser2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user2)
        val Username=intent.getStringExtra("extrausername")
        val UserPassword=intent.getStringExtra("extrauserpass")
        val UserAge="20"
        val UserSex="男"
        val UserAim="体测"
        val UserData1= ContentValues().apply {

            put("password", UserPassword)
            put("UserName", Username)
            put("Age", UserAge)
            put("Sex",UserSex)
            put("Aim",UserAim)

        }
        button8.setOnClickListener {
            val dbHelper = Dietplan(this, "food.db", 2)
            val db = dbHelper.writableDatabase
            db.insert("Userdata",null,UserData1)
        }
    }
}