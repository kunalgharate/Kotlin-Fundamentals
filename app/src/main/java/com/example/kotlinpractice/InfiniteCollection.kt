package com.example.kotlinpractice

fun main(args: Array<String>) {

    var arrayOFname = ArrayList<String>()

   val data =  cars.
   asSequence().
   map {

       arrayOFname.add(it.name)
   }

    data.forEach {
      print(it)
  }
}

val cars = listOf(
    MotorVehicle("Swift", 2016, "Maruti"),
    MotorVehicle("Altroz", 2020, "Tata"),
    MotorVehicle("Verna", 2019, "Hyundai")
)
val bikes = listOf(
    MotorVehicle("R-15", 2018, "Yamaha"),
    MotorVehicle("Gixxer", 2017, "Suzuki")
)

