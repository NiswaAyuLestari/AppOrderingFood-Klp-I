package com.lenovo.orderingfood

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//
//import android.content.ContentValues
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast
//
class Registration : AppCompatActivity() {
//
    var TxName: EditText? = null
    var TxUser: EditText? = null
    var TxEmail: EditText? = null
    var TxPassword: EditText? = null
    var TxConPassword: EditText? = null
    var BtnRegister: Button? = null
    var dbHelper: DBHelper? = null
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
//
        dbHelper = DBHelper(this)
        TxName = findViewById(R.id.et_name) as EditText?
        TxUser = findViewById(R.id.et_user) as EditText?
        TxEmail = findViewById(R.id.et_email) as EditText?
        TxPassword = findViewById(R.id.et_pass) as EditText?
        TxConPassword = findViewById(R.id.et_confirm) as EditText?
        BtnRegister = findViewById(R.id.bt_regis) as Button?
//
//
        val textLogin: TextView = findViewById(R.id.tv_sign_in)
        textLogin.setOnClickListener {
            val intentLogin = Intent(this, Login::class.java)
            startActivity(intentLogin)
        }
//
        BtnRegister!!.setOnClickListener {
            val email = TxEmail!!.text.toString().trim { it <= ' ' }
            val user = TxUser!!.text.toString().trim { it <= ' ' }
            val password = TxPassword!!.text.toString().trim { it <= ' ' }
            val conPassword = TxConPassword!!.text.toString().trim { it <= ' ' }
            val values = ContentValues()
            if (password != conPassword) {
                Toast.makeText(this@Registration, "Password not match", Toast.LENGTH_SHORT)
                    .show()
            } else if (password == "" || email == "" || user == "") {
                Toast.makeText(
                    this@Registration,
                    "Username, Email or Password cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                values.put(DBHelper.row_email, email)
                values.put(DBHelper.row_user, user)
                values.put(DBHelper.row_password, password)
                dbHelper!!.insertData(values)
                Toast.makeText(this@Registration, "Register successful", Toast.LENGTH_SHORT)
                    .show()
                startActivity(Intent(this@Registration, Login::class.java))
            }
        }
    }
}
