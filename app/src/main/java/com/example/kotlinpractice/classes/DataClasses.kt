package com.example.kotlinpractice.classes


// They are my teammate we are working on same project
fun main(args: Array<String>) {
    val amit = Student(1,"Amit")
    val rahul = Student(1,"Amit")

    // Check is equal

    if (amit==rahul)
    {
        print("Equel \n")
    }

    var amitCopy = amit.copy(name = "Vishal")

    println(amitCopy)
}
data class Student(var id:Int,var name:String)

