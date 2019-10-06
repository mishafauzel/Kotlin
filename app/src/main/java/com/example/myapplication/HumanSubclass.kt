package com.example.myapplication
//first calling superclass constructor, after superclass init, after subclass constructor and init and secondary constructor
class HumanSubclass(name:String,age:Int) :Human(name,age) {
    init {
        println("from human subclass $name,$age")
    }
    constructor():this("misha",20)
    {
        println("subclass secondary constructor")
    }

}