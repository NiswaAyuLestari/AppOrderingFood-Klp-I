package com.lenovo.orderingfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast
//
class Login : AppCompatActivity() {
//
    var TxEmail: EditText? = null
    var TxUser: EditText? = null
    var TxPassword: EditText? = null
    var BtnLogin: Button? = null
    var dbHelper: DBHelper? = null
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//
        TxEmail = findViewById(R.id.et_email) as EditText?
        TxUser = findViewById(R.id.et_email) as EditText?
        TxPassword = findViewById(R.id.et_pass) as EditText?
        BtnLogin = findViewById(R.id.bt_login) as Button?
        dbHelper = DBHelper(this)
//
        val EXTRA_MESSAGE_USERNAME = "User"
        val EXTRA_MESSAGE_PASS = "Pass"
//
//
        BtnLogin!!.setOnClickListener {
            val email = TxEmail!!.text.toString().trim { it <= ' ' }
            val user = TxUser!!.text.toString().trim { it <= ' ' }
            val password = TxPassword!!.text.toString().trim { it <= ' ' }
            val res = dbHelper!!.checkUser(email, password, user)
            if (res == true) {
                Toast.makeText(this@Login, "Login Successful", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@Login, HomeActivity::class.java)).apply {
                    intent.putExtra("User", email)
                }
            } else {
                Toast.makeText(this@Login, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
//
        val textRegis: TextView = findViewById(R.id.tv_regis)
        textRegis.setOnClickListener {
            val intentLogin = Intent(this, Registration::class.java)
            startActivity(intentLogin)
        }

    }
}