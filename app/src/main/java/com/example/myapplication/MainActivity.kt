package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG:String="MainActivity"
    val someNum=5
    //declaring nullable and changable variable
    var someString:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        someString=if(someNum>4)
                    null
        else
            "mama mila ramu"
        someString?.toUpperCase()

        print(someString)
        //foreach in Kotlin
        var nums=0..16
        for (a in nums step 2)//step is incrementing size
            println(a)
        var  downNum=16 downTo 0
        for (a in downNum)
            println("down $a")
        var untilNums=1 until 16
        for(a in untilNums)
            println("until $a")
        for(a in untilNums.reversed())
            println("until reversed $a")
        //switch in kotlin
        someString=when (someNum)
        {
            2->"mama"
            3->"mila"
            5->"ramu"
            else->
                null
        }
        println(someString)

    }
}
