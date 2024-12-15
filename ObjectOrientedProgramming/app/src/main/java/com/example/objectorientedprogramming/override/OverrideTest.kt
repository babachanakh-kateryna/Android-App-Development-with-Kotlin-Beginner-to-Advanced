package com.example.objectorientedprogramming.override

fun main(args: Array<String>) {
    // Create an object from Vehicle class
    var vehicle = Vehicle()
    vehicle.start()
    vehicle.accelerate(50)
    vehicle.stop()

    println("-------------------")

    // Create an object from Car class
    var car = Car()
    car.start()
    car.accelerate(100)
    car.stop()

    println("-------------------")
    car.superStart()
    car.superAccelerate()
    car.superStop()

}