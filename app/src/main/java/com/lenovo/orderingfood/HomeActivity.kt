package com.lenovo.orderingfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.database.sqlite.SQLiteDatabase

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("User").toString()
        val tv_user: TextView = findViewById(R.id.user)
        tv_user.setText(username)

    }
}