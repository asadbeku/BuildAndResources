package com.example.homewor10_7

open class currencyConvertorToVON(): CurrencyConverter{

    override val currencyCode: String = "VON"
    override val course: Double = 0.0633

    override fun convertToRub(value: Double): Double {
        return value * course
    }
}