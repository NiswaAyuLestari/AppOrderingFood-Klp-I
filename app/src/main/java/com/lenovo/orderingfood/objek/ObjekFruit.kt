package com.lenovo.orderingfruit.objek

import com.lenovo.orderingfood.R
import com.lenovo.orderingfood.model.FruitModel


object ObjekFruit {
    private val fruitNames = arrayOf(
        "Orange",
        "kiwi",
        "Watermelon",
        "Pomogranate",
        "Apple",
        "Strawberry",
        "Mango"
    )

    private val fruitJenis = arrayOf(
        "Orange",
        "kiwi",
        "Watermelon",
        "Pomogranate",
        "Apple",
        "Strawberry",
        "Mango"
    )

    private val fruitDesk = arrayOf(
        "This Fruit, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Fruit, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Fruit, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Fruit, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Fruit, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Fruit, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Fruit, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins."
    )

    private val fruitHarga = arrayOf(
        "Rp. 30.000,-",
        "Rp. 20.000,-",
        "Rp. 25.000,-",
        "Rp. 40.000,-",
        "Rp. 30.500,-",
        "Rp. 28.000,-",
        "Rp. 42.000,-",
    )

    private val fruitImages = intArrayOf(
        R.drawable.c,
        R.drawable.cc,
        R.drawable.ccc,
        R.drawable.cccc,
        R.drawable.ccccc,
        R.drawable.cccccc,
        R.drawable.ccccccc
    )

    val listData: ArrayList<FruitModel>
        get() {
            val list = arrayListOf<FruitModel>()
            for (position in fruitNames.indices) {
                val hero = FruitModel()
                hero.nama = fruitNames[position]
                hero.jenis = fruitJenis[position]
                hero.harga = fruitHarga[position]
                hero.photo = fruitImages[position]
                hero.deskripsi = fruitDesk[position]
                list.add(hero)
            }
            return list
        }
}