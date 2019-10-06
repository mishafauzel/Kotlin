//use this for naming of your kotlin file(default is name of file )
@file:JvmName("First")
package com.example.myapplication

import java.lang.NumberFormatException

fun doSomenthing()
{
    var num=5
    val string = num.toString()

    println("Im doing something without class")
    println(string)
    println("amount with specified = "+calculateAmount(50,0.5))
    println("amount with default = "+ calculateAmount(50))
    // you can call method like this(like in C#)
    println("amount with named parameters =" + calculateAmount(interest = 0.3,amount = 20))
    try {
        var retNum=toInteger("4b")
        println("String to int $retNum")
        }catch (exception:NumberFormatException)
    {
        println(exception.message)
    }
    println("to integer with expression,after 4 is "+ toIntegerWithExpression("4"))


}
//setting default number if it was not specified during call of method,must be after all non default parameters
//method with default parameters can be called from java only if it marked with annotation @JvmOverloads
@JvmOverloads
 fun  calculateAmount(amount:Int,interest:Double=0.4):Int
 {
     return  (amount+amount*interest).toInt()
 }
//this is instead of throws keyword
@Throws(NumberFormatException::class)
fun toInteger(string:String):Int?
{
    return string.toInt()

}

//try block is also expression as if/switch
fun toIntegerWithExpression(string:String):Int
{
    var retNum=try
{
    string.toInt()
}catch(exception:NumberFormatException)
    {
        0
    }
    retNum++
    return retNum

}