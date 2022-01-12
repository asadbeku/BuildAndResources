package com.example.homewor10_7

class currencyConvertorToUSD(): CurrencyConverter{
    override val currencyCode: String = "USD"
    override val course: Double = 0.0132

    override fun convertToRub(value: Double): Double {
        return value * course
    }

}