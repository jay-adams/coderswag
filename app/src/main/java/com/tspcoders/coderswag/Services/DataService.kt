package com.tspcoders.coderswag.Services

import com.tspcoders.coderswag.Model.Category
import com.tspcoders.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hata = listOf(
        Product("Devslopes Graphics Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "haoodie01"),
        Product("Devslopes Hoodie Red", "$32", "haoodie02"),
        Product("Devslopes Gray Hoodie", "$28", "haoodie03"),
        Product("Devslopes Black Hoodie", "$32", "haoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$28", "shirt01"),
        Product("Devslopes Badge Light Gray", "$20", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$22", "haoodie03"),
        Product("Devslopes Hustle", "$22", "haoodie04"),
        Product("Kickflip Studios", "$18", "haoodie04")
    )
}