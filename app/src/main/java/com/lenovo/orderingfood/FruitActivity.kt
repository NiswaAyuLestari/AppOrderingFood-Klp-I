package com.lenovo.orderingfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lenovo.orderingfood.adapter.FruitAdapter
import com.lenovo.orderingfood.model.FruitModel
import com.lenovo.orderingfruit.objek.ObjekFruit

class FruitActivity : AppCompatActivity() {
    private lateinit var rvFruit: RecyclerView
    private var list: ArrayList<FruitModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)

        rvFruit = findViewById(R.id.rvFruit)
        rvFruit.setHasFixedSize(true)

        //panggil data di objek
        list.addAll(ObjekFruit.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvFruit.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = FruitAdapter(list)
        rvFruit.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : FruitAdapter.OnItemClickCallback {
            override fun onItemClicked(data: FruitModel) {
                showSelectedHero(data)
            }
        })

    }

    private fun showSelectedHero(hero: FruitModel) {
        Toast.makeText(this, "Kamu memilih " + hero.nama, Toast.LENGTH_SHORT).show()

        val intent = Intent(this@FruitActivity, DetailDrink::class.java)
        intent.putExtra(DetailDrink.EXTRA_NAMA, hero.nama)
        intent.putExtra(DetailDrink.EXTRA_PHOTO, hero.photo)
        intent.putExtra(DetailDrink.EXTRA_JENIS, hero.jenis)
        intent.putExtra(DetailDrink.EXTRA_HARGA,hero.harga)
        intent.putExtra(DetailDrink.EXTRA_DESK, hero.deskripsi)
        startActivity(intent)
    }
}
