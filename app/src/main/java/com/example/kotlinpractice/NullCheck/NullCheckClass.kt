package com.example.kotlinpractice.NullCheck

fun main(args: Array<String>) {


    var meeting: Meeting? = null


    var newMeeting = Meeting()

    // Null not worked
    println("From meeting object ${meeting?.close()}")

    // Elvis
    println("From meeting object ${meeting ?: Meeting().close()}")

    // Created object

    println("From new meeting ${newMeeting.close()}")


    val isNull = meeting?.let {
        meeting.close()
    }
    println("Meeting object is  $isNull")

    val isNewMeetingNull = newMeeting?.let {
        newMeeting.close()
    }
    println(" New Meeting object is  $isNewMeetingNull")
    //Crashed

    println("From new meeting ${meeting!!.close()}")


}

class Meeting{
    var isClose : Boolean = false

    fun  close():Boolean
    {
        return true
    }
}