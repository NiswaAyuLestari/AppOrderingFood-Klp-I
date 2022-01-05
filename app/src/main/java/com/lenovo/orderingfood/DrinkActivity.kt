package com.lenovo.orderingfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lenovo.orderingfood.adapter.DrinkAdapter
import com.lenovo.orderingfood.model.DrinkModel
import com.lenovo.orderingfood.objek.ObjekDrink

class DrinkActivity : AppCompatActivity() {

    private lateinit var rvDrink: RecyclerView
    private var list: ArrayList<DrinkModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        rvDrink = findViewById(R.id.rvDrink)
        rvDrink.setHasFixedSize(true)

        //panggil data di objek
        list.addAll(ObjekDrink.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvDrink.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = DrinkAdapter(list)
        rvDrink.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : DrinkAdapter.OnItemClickCallback {
            override fun onItemClicked(data: DrinkModel) {
                showSelectedHero(data)
            }
        })

    }

    private fun showSelectedHero(hero: DrinkModel) {
        Toast.makeText(this, "Kamu memilih " + hero.nama, Toast.LENGTH_SHORT).show()

        val intent = Intent(this@DrinkActivity, DetailDrink::class.java)
        intent.putExtra(DetailDrink.EXTRA_NAMA, hero.nama)
        intent.putExtra(DetailDrink.EXTRA_PHOTO, hero.photo)
        intent.putExtra(DetailDrink.EXTRA_JENIS, hero.jenis)
        intent.putExtra(DetailDrink.EXTRA_HARGA,hero.harga)
        intent.putExtra(DetailDrink.EXTRA_DESK, hero.deskripsi)
        startActivity(intent)

//        val intent = Intent(this, DetailDrink::class.java).apply {
//            putExtra("nama", hero.nama);
//            putExtra("jenis", hero.jenis);
//            putExtra("deskripsi", hero.deskripsi);
//            putExtra("harga", hero.harga)
//            putExtra("gambar", hero.photo)
//        }
//        startActivity(intent)
    }
}
