package com.example.myapplication

import androidx.collection.arraySetOf

fun main(args: Array<String>) {
    var mySetArray = arrayListOf<Any>("Kotlin", 25, "Java", 30, "Python", 35, "Java")

    println(mySetArray.size)
    println("Last el: ${mySetArray.last()}")

    println("First el: ${mySetArray.first()}")
    println("Element at index 1: ${mySetArray.elementAt(1)}")
    println("Element at index 2: ${mySetArray.elementAt(2)}")
    println("Element at index 3: ${mySetArray.elementAt(3)}")
    println("Element at index 4: ${mySetArray.elementAt(4)}")
    println("Element at index 5: ${mySetArray.elementAt(5)}")
    println("Element at index 6: ${mySetArray.elementAt(6)}")



    var mySetArrayNew = setOf<Any>("Kotlin", 25, "Java", 30, "Python", 35, "Java")

    println(mySetArrayNew.size)
    println("Last el: ${mySetArrayNew.last()}")

    println("First el: ${mySetArrayNew.first()}")
    println("Element at index 1: ${mySetArray.elementAt(1)}")
    println("Element at index 2: ${mySetArrayNew.elementAt(2)}")
    println("Element at index 3: ${mySetArrayNew.elementAt(3)}")
    println("Element at index 4: ${mySetArrayNew.elementAt(4)}")
}