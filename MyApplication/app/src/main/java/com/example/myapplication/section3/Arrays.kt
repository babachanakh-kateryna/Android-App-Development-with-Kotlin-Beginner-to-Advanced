package com.example.myapplication.section3

fun main(args: Array<String>) {
    var age = arrayOf(1,2,3)

    println("First Element: ${age[0]}")
    println("Second Element: ${age.get(1)}")
    println("Third Element: ${age[2]}")

    println("-------------------")

    var cars = arrayOf("BMW", "Audi", "Mercedes")
    println("First Car: ${cars[0]}")
    println("Second Car: ${cars.get(1)}")
    println("Third Car: ${cars[2]}")

    println("-------------------")

    cars.set(2, "Toyota")
    println("Third Car: ${cars[2]}")

    println(cars.size)

    println("-------------------")

    var carsAndAge = arrayOf("BMW", 25, "Audi", 30, "Mercedes", 35)
    println("First Car: ${carsAndAge[0]}")
    println("First Car Age: ${carsAndAge[1]}")
    println("Second Car: ${carsAndAge.get(2)}")
    println("Second Car Age: ${carsAndAge[3]}")

}