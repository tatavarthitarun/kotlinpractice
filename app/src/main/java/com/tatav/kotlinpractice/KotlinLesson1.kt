package com.tatav.kotlinpractice

import android.health.connect.datatypes.units.Length
import java.util.Random

fun main(args: Array<String>) {
/*    data class Person(val name: String, val books: List<String>)

    val people = listOf(
        Person("Alice", listOf("Alice in Wonderland", "Avengers")),
        Person("Bob", listOf("Batman", "Animal Farm")),
        Person("Charlie", listOf("Cinderella", "Artemis"))
    )

// FlatMap without any filter
    val allBooks = people.flatMap { it }
    println("All Books: $allBooks")*/
    val dateIdeas = listOf("Park: 9 AM", "Cafe: 11 AM", "Gym: 6 PM", "Beach: 4 PM", "Cafe: 5 PM")

// Filter and map using lazy sequences
/*    val romanticSpots = dateIdeas.asSequence()
        .filter { it.contains("Park") || it.contains("Cafe") }
        .map {
            println("Processing: $it") // To show when each element is processed
            "$it - Perfect for us! 💕"
        }

    println("Lazy sequence: $romanticSpots")
    println("First romantic spot: ${romanticSpots.first()}")
    println("All romantic spots: ${romanticSpots.toList()}")*/
val aquariumA = Aquarium(40)
    println(Aquarium(40))
}

class Aquarium(private var length:Int , private var width:Int = 50, private var height:Int=50 ){
    init {
        println("Class is Initializing")
    }
    init {
        println("Volume : ${length*width*height/1000} liters")
    }
    fun printSize(){
        println("Lenght:$length , Width:$width, Height:$height")
    }
}