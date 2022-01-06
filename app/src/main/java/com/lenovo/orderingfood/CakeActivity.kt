package com.lenovo.orderingfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lenovo.orderingfood.adapter.CakeAdapter
import com.lenovo.orderingfood.model.CakeModel
import com.lenovo.orderingfood.objek.ObjekCake


class CakeActivity : AppCompatActivity() {

    private lateinit var rvCake: RecyclerView
    private var list: ArrayList<CakeModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cake)

        rvCake = findViewById(R.id.rvCake)
        rvCake.setHasFixedSize(true)

        //panggil data di objek
        list.addAll(ObjekCake.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvCake.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = CakeAdapter(list)
        rvCake.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : CakeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: CakeModel) {
                showSelectedHero(data)
            }
        })

    }

    private fun showSelectedHero(hero: CakeModel) {
        Toast.makeText(this, "Kamu memilih " + hero.nama, Toast.LENGTH_SHORT).show()

        val intent = Intent(this@CakeActivity, DetailDrink::class.java)
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