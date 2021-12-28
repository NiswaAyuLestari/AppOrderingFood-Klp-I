package com.lenovo.orderingfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class SlashScreen : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slash_screen)

        val buttonLogin: Button = findViewById(R.id.bt_login)
        buttonLogin.setOnClickListener {
            val intentLogin = Intent(this, Login::class.java)
            startActivity(intentLogin)
        }

        val buttonRegis: Button = findViewById(R.id.bt_regis)
            buttonRegis.setOnClickListener{
                val intenRegis = Intent(this, Registration::class.java)
                startActivity(intenRegis)
            }
        }
}