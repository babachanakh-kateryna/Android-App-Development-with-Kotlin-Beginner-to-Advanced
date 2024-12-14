package com.example.myapplication

fun main(args: Array<String>) {
    println("-------immutable map------------")
    // immutable map
    var age = mapOf<String, Int>("John" to 25, "James" to 30, "Sam" to 35)

    println(age.size)
    println("John's age: ${age["John"]}")
    println("James's age: ${age.get("James")}")
    println("Sam's age: ${age["Sam"]}")

    println("-------mutable map------------")
    // mutable map
    var mutableAge = mutableMapOf<String, Int>("John" to 25, "James" to 30, "Sam" to 35)

    mutableAge.put("John", 26)
    println(mutableAge.size)
    println("John's age: ${mutableAge["John"]}")
    println("James's age: ${mutableAge.get("James")}")
    println("Sam's age: ${mutableAge["Sam"]}")
    println("John's age: ${mutableAge.get("John")}")
}