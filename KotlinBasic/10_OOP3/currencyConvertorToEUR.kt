package com.example.homewor10_7

open class currencyConvertorToEUR(): CurrencyConverter{

    override val currencyCode: String = "EUR"
    override val course: Double = 0.0116

    override fun convertToRub(value: Double): Double {
        return value * course
    }
}