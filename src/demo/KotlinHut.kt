package demo

fun main(args: Array<String>) {

    //不可变
    val name = "stephen"

    //可变
    var sex = "male"

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)
    println("smallInt Int : $smallInt")

    if (sex is String) {
        println("true")
    } else {
        println("false")
    }

    println("3.14 to Int : " + (3.14.toInt()))
    println("A to Int : " + ('A'.toInt()))
    println("65 to Char : " + (65.toChar()))

    //-----

    val myName = "Luke W"
    val longStr = """This is a long String"""

    var fName: String = "Luke"
    var lName: String = "W"

    fName = "Sally"

    var fullName = "$fName $lName"
    println("Name : $fullName")

    println("1 + 2 = ${1 + 2}")
    println("String Length =  ${longStr.length}")

    var str1 = "A random String"
    var str2 = "a random String"

    println("Strings Equal : ${str1.equals(str2)}")
    println("Compare A to B : ${"A".compareTo("B")}")

    println("2nd Index : ${str1.get(2)}")
    // or println("2nd Index : ${str1[2]}")

    println("Index 2 - 7 : ${str1.subSequence(2, 8)}")
    println("Contains random : ${str1.contains("random")} ")



    //----


}