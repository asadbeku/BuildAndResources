package com.example.homework1

//This is Homework1

fun main(){
    val firstName: String = "Asadbek"
    val lastName: String = "O'ralboyev"
    var height: Int = 172
    var weight: Float = 62F
    var isChild: Boolean
    isChild = height<150 || weight<40
    //Firs info
    var info = """
    My name is $firstName 
    My last name is ${lastName}.
    My height is $height
    My weight $weight
    I'm ${if (isChild) "child" else "not child"}
    """
    print(info)


    //Changed info
    height=140
    isChild = height<150 || weight<40
    info = """
    My name is $firstName 
    My last name is ${lastName}.
    My height is $height
    My weight $weight
    I'm ${if (isChild) "child" else "not child"}
    """
    print(info)
}