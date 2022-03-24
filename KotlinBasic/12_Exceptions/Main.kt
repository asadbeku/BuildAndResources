package com.example.homework_12

fun main(){

    val pressure: Double = readLine()?.toDoubleOrNull()?: return

    try {
        Wheel().pumpUpWheel(pressure)
    }catch (t: TooHighPressure){
        println(t.message)
    }


}