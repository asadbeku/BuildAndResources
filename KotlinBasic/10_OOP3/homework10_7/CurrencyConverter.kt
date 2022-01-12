package com.example.homewor10_7

interface CurrencyConverter{
    val currencyCode : String
    val course : Double
        get() = 100.0

    fun convertToRub(value: Double): Double{
        return value * course
    }


}