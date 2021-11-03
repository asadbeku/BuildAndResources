package com.example.homework3

fun main(){

    print("Введите число a: ")
    val a: Int = readLine()?.toIntOrNull() ?: return
    print("Введите число b: ")
    val b: Int = readLine()?.toIntOrNull() ?: return
    println("Нод: ${nod(a, b)}")

    print("Введите число n: ")
    val n: Int = readLine()?.toIntOrNull() ?: return

    var i: Int = 0
    var sum: Int = 0
    var number: Int
    while (i<n){
        number = readLine()?.toIntOrNull() ?: return
        if (number>0) sum+=number
        i++
    }
    println(sum)
}

tailrec fun nod(a: Int, b: Int): Int{
    return if (b==0) a
    else nod(b, a%b)
}