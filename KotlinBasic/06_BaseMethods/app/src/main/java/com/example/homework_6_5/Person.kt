package com.example.homework_6_5

class Person(
    val height: Int,
    val weight: Int,
    val name: String
) {
    val pets = hashSetOf<Animal>()
    val animalSet = listOf(
        "Dog",
        "Cat",
        "Cow",
        "Hourse"
    )
    fun byPet(): Animal {
        val pet = Animal(animalSet.random(), (1..100).random(), (1..100).random())
        pets.add(pet)
        return Animal(animalSet.random(), (1..100).random(), (1..100).random())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if(javaClass !=other) return false

        other as Person

        if (height !=other.height) return false
        if (weight !=other.weight) return false
        if (name !=other.name) return false

        return true
    }
    override fun hashCode(): Int {
        var result = height
        result = 31 * result + weight
        result = 31 * result + name.hashCode()
        return result
    }
    override fun toString(): String {
        return "Person(Name: $name, weight: $weight, height: $height, ${byPet() }} }}"
    }


}