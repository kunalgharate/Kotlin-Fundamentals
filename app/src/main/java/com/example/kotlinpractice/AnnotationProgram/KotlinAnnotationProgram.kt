package com.example.kotlinpractice.AnnotationProgram


fun main(args: Array<String>) {
    val m = Meeting()

    m.addTitle("Meeting with BOSS")
    //m.addTitle(null)  null not acceptable

    val title: String? = m.meetingTitle

    println(title)
}
class KotlinAnnotationProgram {
}