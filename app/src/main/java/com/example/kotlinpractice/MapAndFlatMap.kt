package com.example.kotlinpractice

class MapAndFlatMap {


}

fun main(args: Array<String>) {


    // Map  - Transform into another result

    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map {
        it * it
    }

    println("square no $squaredNumbers")
    //Flatmap - Flatmap is use for merge 2 same data set

    val cars = listOf(
        MotorVehicle("Swift", 2016, "Maruti"),
        MotorVehicle("Altroz", 2020, "Tata"),
        MotorVehicle("Verna", 2019, "Hyundai")
    )
    val bikes = listOf(
        MotorVehicle("R-15", 2018, "Yamaha"),
        MotorVehicle("Gixxer", 2017, "Suzuki")
    )

    val vehicles = listOf(cars, bikes)
    val allVehicles = vehicles.flatMap { it }


    println(allVehicles)
}

data class MotorVehicle(
    val name: String,
    val model: Int,
    val manufacturer: String
)