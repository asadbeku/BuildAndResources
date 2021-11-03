package com.example.homework_5_4

import com.example.homework_5_4.oop.*

fun main(){

    val home = listOf(
            Room(16.0),
            badRoom(16.0),
            livingRoom(14.0),
            cookingRoom(10.0),
            badRoom(8.0),
            childrensRoom(12.7,"Childrens room"),
            myRoom(15.0,"WorkOut room")
    )
    home.forEach {
        it.getDescription()
    }
}