package com.lenovo.orderingfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailDrink : AppCompatActivity() {
    private var title: String = "Detail"

    companion object {
        const val EXTRA_NAMA = "extra nama"
        const val EXTRA_PHOTO = "extra image"
        const val EXTRA_JENIS = "extra detail"
        const val EXTRA_DESK = "extra nama bunga"
        const val EXTRA_HARGA = "extra family"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_drink)
        setActionBarTitle(title)

        //inisialisasi di activity_detail.xml
        val nama_drink: TextView = findViewById(R.id.NamaDrink)
        val jenis_drink: TextView = findViewById(R.id.JenisDrink)
        val deskripsi_drink: TextView = findViewById(R.id.Deskripsi)
        val harga_drink: TextView = findViewById(R.id.HargaDrink)
        val foto_drink: ImageView = findViewById(R.id.imgDrink)

        //proses mendapatkan
        val nama = intent.getStringExtra(EXTRA_NAMA)
        val foto = intent.getIntExtra(EXTRA_PHOTO, 0)
        val jenis = intent.getStringExtra(EXTRA_JENIS)
        val deskripsi = intent.getStringExtra(EXTRA_DESK)
        val harga = intent.getStringExtra(EXTRA_HARGA)

        //gambar
        Glide.with(this)
            .load(foto)
            .apply(RequestOptions())
            .into(foto_drink)

        nama_drink.text = nama
        jenis_drink.text = jenis
        deskripsi_drink.text = deskripsi
        harga_drink.text = harga

        val buttonPesan: Button = findViewById(R.id.bt_pesan)
        buttonPesan.setOnClickListener{
            Toast.makeText(this@DetailDrink, "PESANAN ANDA SEDANG DI PROSES", Toast.LENGTH_SHORT).show()
        }

    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}



