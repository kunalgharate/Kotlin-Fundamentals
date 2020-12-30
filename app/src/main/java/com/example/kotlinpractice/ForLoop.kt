package com.example.kotlinpractice

class ForLoop {


    fun main(args:Array<String> )
    {


        println("Hello from kunal")


        // For loop

        println("********************Forloop *****************")
        for (i in 1..5)
        {
            println(i)
        }

        println("********************Step 2 with forloop *****************")

        // For with step

        for (i in 1..10 step  2)
        {
            println(i)
        }

        println("********************Down to Step 2 with forloop *****************")

        // For with step

        for (i in 10 downTo 1 step  2)
        {
            println(i)
        }

        println("********************1 until 10  *****************")

        // For with until its not print 10 its print "unitl 10"

        for ( i in 1 until 10)
        {
            println(i)
        }

        println("********************Print list of data *****************")

        // Create list of data and print

        // Sort the list with it self



    }

    fun printListOfData()
    {
        var listData =  listOf(11,210,54,505,54,450)

        for ( i in listData)
        {
            val sortAsc = listData.sorted()
            println(sortAsc)


            println("Sorted by length ascending: ${listData.sortedWith(compareBy {it })}")


            println("Sorted by length Descending: ${listData.sortedByDescending{it }}")


            println("Sorted by length Random order : ${listData.shuffled()}")


            println("Reverse with new collection  : ${listData.reversed()}")

            println("Reverse with existing collection  : ${listData.asReversed()}")

        }
    }
}