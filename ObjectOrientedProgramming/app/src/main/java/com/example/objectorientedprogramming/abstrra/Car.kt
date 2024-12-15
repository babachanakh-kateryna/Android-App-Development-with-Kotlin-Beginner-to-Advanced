package com.example.objectorientedprogramming.abstrra

class Car(override var model: Int) : Vechicle() {
    override fun vehicleName(name: String): String {
        return name
    }

}