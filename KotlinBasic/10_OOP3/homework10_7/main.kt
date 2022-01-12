package com.example.homewor10_7

fun main(){

    val value = 100.0
    val currencyCode = "ZBV"
    val converter : CurrencyConverter = Convertors.get(currencyCode)
    val amount = Convertors.get(currencyCode).convertToRub(value)

    println("$value RUB = $amount ${converter.currencyCode}")
}