package com.lenovo.orderingfood.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.lenovo.orderingfood.R
import com.lenovo.orderingfood.model.FruitModel
import java.util.ArrayList

class FruitAdapter(private val listHero: ArrayList<FruitModel>) : RecyclerView.Adapter<FruitAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_fruit, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(1000,250))
            .into(holder.imgPhoto)

        holder.tvName.text = hero.nama
        holder.tvJenis.text = hero.jenis
        holder.tvHarga.text = hero.harga

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listHero[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgFruit)
        var tvName: TextView = itemView.findViewById(R.id.NamaFruit)
        var tvJenis: TextView = itemView.findViewById(R.id.JenisFruit)
        var tvHarga: TextView = itemView.findViewById(R.id.HargaFruit)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: FruitModel)
    }
}