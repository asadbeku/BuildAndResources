package com.example.homework_12

class Wheel() {
    var currentPressure: Double = 2.0

    fun pumpUpWheel(pressure: Double){

        when{(pressure<=2.5 && pressure>=1.6) -> println(" Эксплуатация возможна.") }
        when{(pressure>2.5) -> throw TooHighPressure()}
        when{(pressure<1.6) -> throw TooLowPressure()}
        when{(pressure<0) -> throw IncorrectPressure()}
    }

    fun setPressure(pressure: Double){
        if (pressure<=2.5 && pressure>=1.6){
            currentPressure = pressure
        }
    }
}