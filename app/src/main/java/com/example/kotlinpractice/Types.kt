package com.example.kotlinpractice


interface  Time {
   fun setTime(hours : Int)

   // New fun doesnt need to implement
   fun setTime(time: MyTime) = setTime(time.time)
}


// two interface has same methods

interface AnotherTime {
    fun setTime(time: MyTime){}

}

class MyTime {

    var time:Int=0
}
class Types : Time, AnotherTime {

    override fun setTime(hours: Int) {

    }

    override fun setTime(time: MyTime) {
        super<Time>.setTime(time)
        super<AnotherTime>.setTime(time)

    }
}

