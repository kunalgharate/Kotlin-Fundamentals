package com.example.kotlinpractice

class FliterAndSorting {

    // Filter out unwanted items from the collection similer to sql where clause

    var total = 0
    var items = arrayListOf<String>("Ram","Sita","Lakshman","Krishna","Bhima","Shankar")

    var itemsInt = arrayListOf<Int>(2,2,2,5,6,7)


    //Filter
    val data = items.filter {
        it.equals("Ram")
    }

    // Map -> Map return the diffrent type of data where filter return the data with filter

    val mapData = itemsInt.map {

        if (it%2 ==0) {
            total += it
        }
    }

    // predicates

    val valueofAll = itemsInt.all { it>2
    }
    val valueOfAny = itemsInt.any { it>4
    }

    val isGrether = itemsInt.count { it>2
    }
    val found = itemsInt.find { it>4
    }



}


fun main(args: Array<String>) {

    val filterClass = FliterAndSorting()

    println(filterClass.data)
    println(filterClass.mapData[0])
    println(filterClass.total)
    println(filterClass.valueofAll)
    println(filterClass.valueOfAny)
    println(filterClass.isGrether)
    println(filterClass.found)


}