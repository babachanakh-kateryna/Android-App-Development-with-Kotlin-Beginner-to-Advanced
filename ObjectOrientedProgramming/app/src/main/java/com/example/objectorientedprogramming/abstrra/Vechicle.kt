package com.example.objectorientedprogramming.abstrra

abstract class Vechicle {
    abstract fun vehicleName(name: String) :String
    fun vehicleType(type: String) : String{
       return type
    }

    abstract var model: Int
    var speed:Int? = null
}