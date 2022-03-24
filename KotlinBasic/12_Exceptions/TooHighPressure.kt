package com.example.homework_12

class TooHighPressure : Throwable(){
    override val message: String?
        get() = "Эксплуатация невозможна — давление превышает нормальное."
}