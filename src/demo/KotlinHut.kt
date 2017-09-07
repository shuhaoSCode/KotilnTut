package demo

fun main(args: Array<String>) {

    //不可变
    val name = "stephen"

    //可变
    var sex = "male"

    var bigInt :Int = Int.MAX_VALUE
    var smallInt:Int = Int.MIN_VALUE

    println("Biggest Int : "+ bigInt)
    println("smallInt Int : $smallInt")

    if (sex is String){
        println("true")
    }else{
        println("false")
    }
}