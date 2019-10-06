package com.example.myapplication
//Primary constructor, you can set default value like in methods
open  class Human(n:String,a:Int=20) {
    var name=n
    var age=a
    var thoughts=""
//init block(actions which will be executin after construction of object)
    init
    {
        this.pintData()
    }
    //defining  secondary constructor,secondary constructor should call main constructor via this
    constructor( thoughts:String,name:String,a:Int):this(name,a)
    {
        //this called after init block
        this.thoughts=thoughts
        this.pintData()
    }
    fun pintData()
    {
        println("$name is $age years old and his thoughts $thoughts")
    }

}