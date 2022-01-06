package com.lenovo.orderingfood.objek

import com.lenovo.orderingfood.R
import com.lenovo.orderingfood.model.DrinkModel
import com.lenovo.orderingfood.model.FoodModel

object ObjekFood {
    private val foodNames = arrayOf(
        "Salad",
        "Meatball",
        "Burger",
        "Noodle",
        "Spaghetti",
        "Pizza",
        "Soup"
    )

    private val foodJenis = arrayOf(
        "Mayo, Vegetable",
        "Meat",
        "Bread, Meat, Chease",
        "Noodles, Meat, Shrimp",
        "Noodle, Coorned Beef",
        "Mozarella Cheese",
        "Curry"
    )

    private val foodDesk = arrayOf(
        "This Food, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Food, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Food, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Food, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Food, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Food, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This Food, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins."
    )

    private val foodHarga = arrayOf(
        "Rp. 30.000,-",
        "Rp. 20.000,-",
        "Rp. 25.000,-",
        "Rp. 40.000,-",
        "Rp. 30.500,-",
        "Rp. 28.000,-",
        "Rp. 42.000,-",
    )

    private val foodImages = intArrayOf(
        R.drawable.f,
        R.drawable.ff,
        R.drawable.fff,
        R.drawable.ffff,
        R.drawable.fffff,
        R.drawable.ffffff,
        R.drawable.fffffff
    )

    val listData: ArrayList<FoodModel>
        get() {
            val list = arrayListOf<FoodModel>()
            for (position in foodNames.indices) {
                val hero = FoodModel()
                hero.nama = foodNames[position]
                hero.jenis = foodJenis[position]
                hero.harga = foodHarga[position]
                hero.photo = foodImages[position]
                hero.deskripsi = foodDesk[position]
                list.add(hero)
            }
            return list
        }
}