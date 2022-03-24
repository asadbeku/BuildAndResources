package com.example.homework_12

class IncorrectPressure: Throwable() {
    override val message: String?
        get() = "При накачке процедура не удалась."
}