package com.example.app

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class Dietplan (val context: Context, name: String, version: Int) :
SQLiteOpenHelper(context, name, null, version) {
    private val createdietplan = "create table food (" +
            "id integer primary key autoincrement," +
            "foodperEnergy integer," +
            "foodName text,"+
            "foodIntruduction text)"
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(createdietplan)
        Toast.makeText(context, "Create succeeded", Toast.LENGTH_SHORT).show()
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}