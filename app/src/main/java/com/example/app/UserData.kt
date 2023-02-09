package com.example.app

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class UserData  (val context: Context, name: String, version: Int) :
    SQLiteOpenHelper(context, name, null, version) {
    private val createUser = "create table Userdata (" +
            "id integer primary key autoincrement," +
            "password integer," +
            "UserName text,"+
            "Age integer,"+
            "Sex text,"+
            "Aim text)"
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(createUser)
        Toast.makeText(context, "Create succeeded", Toast.LENGTH_SHORT).show()
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}