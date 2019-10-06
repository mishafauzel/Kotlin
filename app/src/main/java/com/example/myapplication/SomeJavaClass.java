package com.example.myapplication;

public class SomeJavaClass {
    MainActivity mainActivity;

    public SomeJavaClass(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    public int max(int a,int b)
    {
        //call of function from kotlin file,some sort of static method in java
        First.doSomenthing();
        return mainActivity.max(a,b);

    }
}
