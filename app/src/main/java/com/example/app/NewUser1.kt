package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_user1.*

class NewUser1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user1)
        val username=editTextTextPassword.text.toString()
        val userpassword=editTextTextPassword1.text.toString()
        val repeat=editTextTextPassword.text.toString()
        val intent=Intent(this,NewUser2::class.java)
        intent.putExtra("extrausername",username)
        intent.putExtra("extrauserpass",userpassword)

    }
}