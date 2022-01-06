package com.lenovo.orderingfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.database.sqlite.SQLiteDatabase
import android.widget.LinearLayout

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("User").toString()
        val tv_user: TextView = findViewById(R.id.user)
        tv_user.setText(username)

        val drink: LinearLayout = findViewById(R.id.llDrink)
        drink.setOnClickListener{
            val intenRegis = Intent(this, DrinkActivity::class.java)
            startActivity(intenRegis)
        }

        val fruit: LinearLayout = findViewById(R.id.llFruit)
        fruit.setOnClickListener{
            val intenRegis = Intent(this, FruitActivity::class.java)
            startActivity(intenRegis)
        }

        val cake: LinearLayout = findViewById(R.id.llCake)
        cake.setOnClickListener{
            val intenRegis = Intent(this, CakeActivity::class.java)
            startActivity(intenRegis)
        }

        val food: LinearLayout = findViewById(R.id.llFood)
        food.setOnClickListener{
            val intenRegis = Intent(this, FoodActivity::class.java)
            startActivity(intenRegis)
        }
    }
}