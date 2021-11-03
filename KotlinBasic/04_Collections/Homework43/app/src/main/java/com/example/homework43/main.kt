package com.example.homework43

fun main() {

    //1-2-3
    print("Введите количество телефонных номеров: ")
    val amountNumber = readLine()?.toIntOrNull()
            ?: return println("Вы ввели не число!")
    val listNumbers = mutableListOf<String>()
    for (i in 0..amountNumber-1) {
           print("${i+1}-номер: ")
           listNumbers.add(readLine()!!.toString())
    }
    //4
    print("Введите число: ")
    val limitNumbers = readLine()?.toIntOrNull()
            ?: return println("Вы ввели не число!")
    for (i in 0..limitNumbers-1) {
         println("${i+1}-номер: ${listNumbers[i]}")
    }
    //5
    println("Начинающий с приставки +7")
    val sortNumber = listNumbers.filter { v->v.startsWith("+7") }

    for (i in 0..sortNumber.size-1){
        println("${i+1}: ${sortNumber[i]}")
    }
    //6-7
    val mySet = listNumbers.toSet()
    println("My set size: ${mySet.size}")
    //83
    val map = mapOf("Asadbek" to listNumbers[0])

    println("Mutable Map")
    val mutableMap = map.toMutableMap()
    mutableMap.remove("Asadbek")
    for (i in 0..amountNumber-1)
    {
        print("Введите имя человека с номером телефона ${listNumbers[i]}: ")
        val name = readLine().toString()
        mutableMap.put(name, listNumbers[i])
    }
    for ((key,value) in mutableMap) {
        println("Человек: ${key}, Номер телефона: ${value}")
    }

}