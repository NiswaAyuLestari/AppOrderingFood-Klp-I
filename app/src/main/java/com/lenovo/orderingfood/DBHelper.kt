package com.lenovo.orderingfood

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context?) :
    SQLiteOpenHelper(context, database_name, null, 2) {
    private val db: SQLiteDatabase
    override fun onCreate(db: SQLiteDatabase) {
        val query =
            ("CREATE TABLE " + table_name + "(" + row_id + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + row_email + " TEXT," + row_password + " TEXT," + row_user + " TEXT)")
        db.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + table_name)
    }

    //Insert Data
    fun insertData(values: ContentValues?) {
        db.insert(table_name, null, values)
    }

    fun checkUser(email: String, password: String, user: String,): Boolean {
        val columns = arrayOf(row_id)
        val db = readableDatabase
        val selection = row_email + "=?" + " and " + row_password + "=?" + " and " + row_user + "=?"
        val selectionArgs = arrayOf(email, password, user)
        val cursor = db.query(table_name, columns, selection, selectionArgs, null, null, null)
        val count = cursor.count
        cursor.close()
        db.close()
        return if (count > 0) true else false
    }

    companion object {
        const val database_name = "db_login"
        const val table_name = "table_login"
        const val row_id = "_id"
        const val row_email = "Username"
        const val row_user = "Username"
        const val row_password = "Password"
    }

    init {
        db = writableDatabase
    }
}