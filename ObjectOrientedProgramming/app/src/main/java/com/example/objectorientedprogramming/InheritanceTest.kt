package com.example.objectorientedprogramming

fun main(args: Array<String>) {
    var car = Car()
    car.type = "Car"
    car.model = "Toyota"
    car.maxSpeed = 200

    car.show()

    var motor = Motorcycle()
    motor.type = "Motorcycle"
    motor.model = "Yamaha"
    motor.maxSpeed = 150

    motor.show()
}