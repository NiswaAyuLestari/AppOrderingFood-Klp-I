package com.lenovo.orderingfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lenovo.orderingfood.adapter.FoodAdapter
import com.lenovo.orderingfood.model.FoodModel
import com.lenovo.orderingfood.objek.ObjekFood

class FoodActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<FoodModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        rvFood = findViewById(R.id.rvFood)
        rvFood.setHasFixedSize(true)

        //panggil data di objek
        list.addAll(ObjekFood.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = FoodAdapter(list)
        rvFood.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : FoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: FoodModel) {
                showSelectedHero(data)
            }
        })

    }

    private fun showSelectedHero(hero: FoodModel) {
        Toast.makeText(this, "Kamu memilih " + hero.nama, Toast.LENGTH_SHORT).show()

        val intent = Intent(this@FoodActivity, DetailDrink::class.java)
        intent.putExtra(DetailDrink.EXTRA_NAMA, hero.nama)
        intent.putExtra(DetailDrink.EXTRA_PHOTO, hero.photo)
        intent.putExtra(DetailDrink.EXTRA_JENIS, hero.jenis)
        intent.putExtra(DetailDrink.EXTRA_HARGA,hero.harga)
        intent.putExtra(DetailDrink.EXTRA_DESK, hero.deskripsi)
        startActivity(intent)
    }
}