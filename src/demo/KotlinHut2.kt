package demo

import java.util.*

fun main(args: Array<String>) {

    /*var myArray = arrayOf(1, 1.23, "luke")
    println(myArray[2])
    myArray[1] = 3.14
    println("Array Size : ${myArray.size}")
    println("Luke in Array : ${myArray.contains("luke")}")

    var partArray = myArray.copyOfRange(0, 1)

    println("First : ${myArray.first()}")
    println("Luke Index : ${myArray.indexOf(" luke")}")

    var sqArray = Array(5, { x -> x * x })
    println(sqArray[3])
    println(sqArray.size)

    var arrayInt: Array<Int> = arrayOf(1, 2, 3)*/

    /*val oneTo10 = 1..10;
    val alpha = "A".."Z"
    println("R in Alpha : ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)
    for (x in rng3) println("rng3 : $x")
    for (x in tenTo1.reversed()) println("tenTo1 : $x")*/

    /*var age = 100

    when (age) {
        0, 1, 2, 3, 4, 5 -> println("幼稚园")

        in 6..12 -> {
            val grade = age - 5
            println("小学${grade}年级")
        }

        in 13..15 -> {
            val grade = age - 12
            println("初$grade")
        }

        in 16..18 -> {
            val grade = age - 15
            println("高$grade")
        }

        else -> println("大学")
    }*/

    val rand = Random();
    val magicNum = rand.nextInt(50) - 1

    var guess = 0

    while (magicNum != guess) {
        guess += 1
    }

    println("Magic Number was $guess")

    for (x in 1..100) {

        if (x % 2 == 0) continue

        println("Odd : $x")

        if (x == 31) break
    }

    var arr3: Array<Int> = arrayOf(3, 6, 9)

    for (i in arr3.indices) println("Muit 3 : ${arr3[i]}")

    for ((index,value) in arr3.withIndex()){
        println("Index : $index Value : $value")
    }


}