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
            "Time1 text,"+
            "Time2 text,"+
            "foodIntruduction text)"
    private val createExercise = "create table Exercise (" +
            "id integer primary key autoincrement," +
            "Name text," +
            "Aim1 text," +
            "Aim2 text," +
            "Aim3 text," +
            "Body text,"+
            "Body2 text,"+
            "Body3 text,"+
            "Severity text,"+
            "introduction text,"+
            "Time integer,"+
            "IsNeed text)"
    private val Exeplan = "create table ExercisePlan (" +
            "id integer primary key autoincrement," +
            "ExeName text," +
            "Date text," +
            "GroupNumber integer," +
            "Number integer)"
    private val createUser = "create table Userdata (" +
            "id integer primary key autoincrement," +
            "password text," +
            "UserName text,"+
            "Age integer,"+
            "Sex text,"+
            "Aim text)"
    private val breakfast = "create table Breakfast (" +
            "id integer primary key autoincrement," +
            "date text," +
            "foodName text,"+
            "AdviceFood text,"+
            "WholeEnergy integer,"+
            "Wholezhifang integer,"+
            "Wholedanbai integer,"+
            "Wholedtanshui integer)"


    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(createdietplan)
        db.execSQL(createExercise)
        db.execSQL(Exeplan)
        Toast.makeText(context, "Create succeeded", Toast.LENGTH_SHORT).show()
    }
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        if (oldVersion <= 2) {

            db.execSQL(breakfast)
            Toast.makeText(context, "11111", Toast.LENGTH_SHORT).show()
        }


    }
}