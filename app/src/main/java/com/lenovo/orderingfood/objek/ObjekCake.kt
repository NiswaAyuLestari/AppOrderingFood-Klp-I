package com.lenovo.orderingfood.objek

import com.lenovo.orderingfood.R
import com.lenovo.orderingfood.model.CakeModel
import com.lenovo.orderingfood.model.DrinkModel

object ObjekCake {
    private val cakeNames = arrayOf(
        "Cup Cake",
        "Tart",
        "Water",
        "Chocolate Pudding",
        "Corn Pudding",
        "Pie",
        "Pancake"
    )

    private val cakeJenis = arrayOf(
        "Cup Cake",
        "Tart",
        "Water",
        "Chocolate",
        "Corn, Vanilla",
        "Cream Vanilla",
        "Honey"
    )

    private val cakeDesk = arrayOf(
        "This cake, healthy cake is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This cake, healthy cake is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This cake, healthy cake is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This cake, healthy cake is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This cake, healthy cake is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This cake, healthy cake is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This cake, healthy cake is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins."
    )

    private val cakeHarga = arrayOf(
        "Rp. 30.000,-",
        "Rp. 20.000,-",
        "Rp. 25.000,-",
        "Rp. 40.000,-",
        "Rp. 30.500,-",
        "Rp. 28.000,-",
        "Rp. 42.000,-",
    )

    private val cakeImages = intArrayOf(
        R.drawable.k,
        R.drawable.kk,
        R.drawable.kkk,
        R.drawable.kkkk,
        R.drawable.kkkkk,
        R.drawable.kkkkkk,
        R.drawable.kkkkkkk
    )

    val listData: ArrayList<CakeModel>
        get() {
            val list = arrayListOf<CakeModel>()
            for (position in cakeNames.indices) {
                val hero = CakeModel()
                hero.nama = cakeNames[position]
                hero.jenis = cakeJenis[position]
                hero.harga = cakeHarga[position]
                hero.photo = cakeImages[position]
                hero.deskripsi = cakeDesk[position]
                list.add(hero)
            }
            return list
        }
}