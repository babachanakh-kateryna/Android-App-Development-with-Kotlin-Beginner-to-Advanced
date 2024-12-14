package com.example.myapplication.section3

fun main(args: Array<String>) {

    var age = ArrayList<Int>()

    age.add(1)
    age.add(1, 2)
    age.add(220)

    println("First Element: ${age[0]}")
    println("Second Element: ${age.get(1)}")
    println("Third Element: ${age[2]}")

    println("-------------------")

    age.remove(1)
    println("First Element: ${age[0]}")
    println("Second Element: ${age.get(1)}")
    println(age.size)

    println("-------------------")
    var cars = arrayListOf<String>("BMW", "Audi")
    cars.add("Toyota")
    println("First Car: ${cars[0]}")
    println("Second Car: ${cars.get(1)}")
    println("Third Car: ${cars[2]}")

    println("-------------------")
    var mixArray = arrayListOf<Any>("BMW", 25, "Audi", false)
    println("First Car: ${mixArray[0]}")
    println("First Car Age: ${mixArray[1]}")
    println("Second Car: ${mixArray.get(2)}")
    println("Second Car Age: ${mixArray[3]}")
}