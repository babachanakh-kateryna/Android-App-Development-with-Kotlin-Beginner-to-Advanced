package com.example.objectorientedprogramming

class MyCars constructor(var name: String, var year: Int) {
    init {
        println("My car is $name and it was made in $year")
    }
}