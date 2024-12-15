package com.example.objectorientedprogramming.abstrra

fun main(args: Array<String>) {
//    var vechicle = Vechicle()
    var car = Car(2020)
    car.speed = 200
    println("Name: ${car.vehicleName("Toyota")} \n" +
            "Model: ${car.model} \nSpeed: ${car.speed} \n" +
            "Type: ${car.vehicleType("Car")}")
}