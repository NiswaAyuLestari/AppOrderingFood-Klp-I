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
import com.lenovo.orderingfood.model.FoodModel
import java.util.ArrayList

class FoodAdapter(private val listHero: ArrayList<FoodModel>) : RecyclerView.Adapter<FoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_food, viewGroup, false)
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
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgFood)
        var tvName: TextView = itemView.findViewById(R.id.NamaFood)
        var tvJenis: TextView = itemView.findViewById(R.id.JenisFood)
        var tvHarga: TextView = itemView.findViewById(R.id.HargaFood)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: FoodModel)
    }
}