package com.example.objectorientedprogramming

class MySecondCars {
    var name:String? = null
    var year:Int? = null
        set
        get
    constructor(name: String, year: Int){
        this.name = name
        this.year = year
    }
}