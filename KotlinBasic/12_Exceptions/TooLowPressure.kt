package com.example.homework_12

class TooLowPressure: Throwable(){
    override val message: String?
        get() = "Эксплуатация невозможна — давление ниже нормальное."
}