package com.lenovo.orderingfood.objek

import com.lenovo.orderingfood.R
import com.lenovo.orderingfood.model.DrinkModel

object ObjekDrink {
    private val drinkNames = arrayOf(
        "Strawberry Summer",
        "Strawberry Summer",
        "Fresh Strawberry",
        "Strawberry Juice",
        "Strawberry Mix",
        "Strawberry Smoothies",
        "Strawberry Chocolate"
    )

    private val drinkJenis = arrayOf(
        "Strawberry, Milk, Ice",
        "Strawberry, Milk, Ice",
        "Strawberry, Milk, Ice",
        "Strawberry, Milk, Ice",
        "Strawberry, Milk, Ice",
        "Strawberry, Milk, Ice",
        "Strawberry, Milk, Ice"
    )

    private val drinkDesk = arrayOf(
        "This fruity, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This fruity, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This fruity, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This fruity, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This fruity, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This fruity, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins.",
        "This fruity, healthy drink is a big hit with kids and adults alike because it tastes like a treat and still delivers the vitamins."
    )

    private val drinkHarga = arrayOf(
        "Rp. 30.000,-",
        "Rp. 20.000,-",
        "Rp. 25.000,-",
        "Rp. 40.000,-",
        "Rp. 30.500,-",
        "Rp. 28.000,-",
        "Rp. 42.000,-",
    )

    private val drinkImages = intArrayOf(
        R.drawable.d,
        R.drawable.dd,
        R.drawable.ddd,
        R.drawable.dddd,
        R.drawable.ddddd,
        R.drawable.dddddd,
        R.drawable.ddddddd
        )

    val listData: ArrayList<DrinkModel>
        get() {
            val list = arrayListOf<DrinkModel>()
            for (position in drinkNames.indices) {
                val hero = DrinkModel()
                hero.nama = drinkNames[position]
                hero.jenis = drinkJenis[position]
                hero.harga = drinkHarga[position]
                hero.photo = drinkImages[position]
                hero.deskripsi = drinkDesk[position]
                list.add(hero)
            }
            return list
        }
}