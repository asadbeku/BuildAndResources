package com.example.homework2
import androidx.annotation.Nullable
import java.lang.Double.NaN
import kotlin.math.sqrt

fun main(){
    val sumSolution: Double? = solveEquation(a = 5, b = -3, c = 2)
    if (sumSolution==null) println("Корней нет") else print(sumSolution)
}

fun  solveEquation(a: Int, b: Int, c: Int): Double? {

    //Вычисляет дискриминант
    val D: Double = (b*b-4*a*c).toDouble()


    //Вычисляет корни уравнение
    return when{
        (D>0)->{
            val x1: Double = ((-b+ sqrt(D))/2*a)
            val x2: Double = ((-b- sqrt(D))/2*a)

            //Вычисляет сумму корней
            (x1+x2)
        }
        D==0.0 ->
        {
        val x: Double = (-b/2*a).toDouble()
        x
        }
        else ->
        {
            null
        }
    }
}