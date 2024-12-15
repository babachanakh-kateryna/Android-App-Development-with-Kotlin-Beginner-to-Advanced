package com.example.objectorientedprogramming

fun main(args: Array<String>) {
//    var myCar = Cars()
//    myCar.name = "BMW"
//    myCar.year = 2015
//
//    var myCar2 = Cars()
//    myCar2.name = "Audi"
//    myCar2.year = 2016
//
//    println("My car is ${myCar.name} and it was made in ${myCar.year}")
//    println("My car is ${myCar2.name} and it was made in ${myCar2.year}")
//    var myCar = MyCars("BMW", 2015)
//    println("My car is ${myCar.name} and it was made in ${myCar.year}")

    var mySecondCars = MySecondCars("Audi", 2016)
    mySecondCars.name = "Audi"
    mySecondCars.year = 2016
    println("My car is ${mySecondCars.name} and it was made in ${mySecondCars.year}")
}