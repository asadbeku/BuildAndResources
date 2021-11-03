package com.example.homework_5_4.oop

open class Room constructor(
        area: Double,
        protected open var title: String = "Обычная комната"
) {
    val area = area

    fun getDescription(){
        println("Тип к.: $title, Площад: $area")
    }
}