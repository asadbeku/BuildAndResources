package com.example.homework_6_5

import java.lang.Math.random

fun main(){
    val person1 = Person(173,63,"Asadbek")
    val person2 = Person(173,63,"Asadbek")

    val set = mutableSetOf(person1, person2)
    println("All elements = ${set.size}")
    val person3 = Person(170,70,"NNN")
    val person4 = Person(100, 23, "Baby")

    set.add(person3)
    set.add(person4)
    set.forEach(){
        println(it)
    }
    person1.byPet()
    person2.byPet()
}