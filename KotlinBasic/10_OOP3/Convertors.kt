package com.example.homewor10_7

object Convertors {
    private val rubToEUR = currencyConvertorToEUR()
    private val rubToUSD = currencyConvertorToUSD()
    private val rubToVON = currencyConvertorToVON()

    fun get(currencyCode: String): CurrencyConverter{
        return when (currencyCode){
            "EUR" -> rubToEUR
            "USD" -> rubToUSD
            "VON" -> rubToVON
            else -> object : CurrencyConverter {
                override val currencyCode: String = currencyCode

                override fun convertToRub(value: Double): Double {
                    return value * 1.0
                }
            }
        }
    }




}