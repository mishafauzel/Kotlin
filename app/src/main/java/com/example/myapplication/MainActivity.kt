package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
//for extending class, you shold call it default constructor, and this class must be open(marked by open keyword,
// in Kotlin all classes are final by default),or it must be non-final in java
class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    val someNum = 5
    //declaring nullable and changable variable
    var someString: String? = null
    //use override keyword for overriding the methods, methods in parents classes must be marked with open keywords also, or non final in java
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testingStringAndRanges()
        testingListsAndMaps()
        testingFunctionsAndJavaClasses()
        testingExtensionFunctions()
        testingInfixFunction()
        testFactorial()
        testNewConstructor()
        testinheritance()

    }

    //declaring methods
    fun summ(a: Int, b: Int): Int {
        return a + b
    }

    //if method contains only one line you can do something like that
    fun summ2(a: Int, b: Int): Int = a + b

    // another way to declaring functions
    fun max(a: Int, b: Int): Int = if (a > b) a else b

    fun testingStringAndRanges() {
        someString = if (someNum > 4)
            null
        else
            "mama mila ramu"
        someString?.toUpperCase()

        print(someString)
        //foreach in Kotlin
        var nums = 0..16
        for (a in nums step 2)//step is incrementing size
            println(a)
        var downNum = 16 downTo 0
        for (a in downNum)
            println("down $a")
        var untilNums = 1 until 16
        for (a in untilNums)
            println("until $a")
        for (a in untilNums.reversed())//instead of array in kotlin there is class Range
            println("until reversed $a")
        //switch in kotlin
        someString = when (someNum) {
            2 -> "mama"
            3 -> "mila"
            5 -> "ramu"
            else ->
                null
        }
        println(someString)
    }

    fun testingListsAndMaps()
    //creating of list
    { var list = listOf("mama", "mila", "ramu")
        for ((a, e) in list.withIndex())
            println("$a $e")
        var map = TreeMap<String, Int>()
        map["something"] = 1
        map["doing"] = 2
        println(map["something"])
        println(map["doing"])
        for ((name, age) in map)
            println("$name $age")}
    fun testingFunctionsAndJavaClasses()
    {  println(summ(5, 3))
        println(summ2(6, 7))
        println(" maximum " + max(8, 12))
        var someJavaClass: SomeJavaClass = SomeJavaClass(this)
        println("maximum from java class " + someJavaClass.max(5, 6));}
    //creating extension function(it will be part of the class),for overloading of operators (like +,-,/,%), you must use operator keyword, and name of method
    // must be like in documentation
    operator fun Alien.plus(alien: Alien):Alien
    {
        return Alien(this.skills+", "+(alien.skills));
    }
    fun testingExtensionFunctions()
    {
        var alien1:Alien = Alien("java")
        var alien2:Alien= Alien("sql")
        var alien3=alien1.plus(alien2)
        println("alien3 has skills: ${alien3.skills}")
        alien3=alien1+alien2
    }
    //creating infix function(you can call it like instanceOf in java)works only if it has one parameter
    infix fun Alien.getSkilsfrom(alien:Alien)
    {
        var oldSkils=this.skills
        this.skills=this.skills+" ,"+alien.skills
        println("My old skills were :"+oldSkils+" ,now my skills are:"+this.skills)
    }
    fun testingInfixFunction()
    {
        var alien1=Alien("java")
        var alien2=Alien("Sql")
        alien1 getSkilsfrom alien2
    }

    //just for luls
    fun factorial(fac:Int):Int
    {
        if(fac==0)
            return 1
        else
            return fac*factorial(fac-1)
    }
    fun testFactorial()
    {
        println("factorial of 12="+factorial(12))
    }
    fun testNewConstructor()
    {
        var human=Human("misha")
        var human2=Human("misha",27)
        var human3=Human("java is great","misha",20)

    }
    fun  testinheritance()
    {
        var human:Human=HumanSubclass("misha",27)
        human=HumanSubclass()
    }

}
