package com.redmagic.frost.fizzbuzz.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private class Student(val name: String, val age: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("Ivan", 100)
        val student2 = Student("jorge", 32)
        val student3 = Student("Ash", 1)

//        val thisIsAVariable = "some String"
//        Log.d("onCreate", thisIsAVariable)

        for (i in 0..30) {
            if (i %15 == 0) {
                Log.i("FizzBuzz", i.toString())
            } else if (i % 5 == 0){
                Log.i("Buzz", i.toString())
            } else if (i % 3 == 0) {
                Log.i("Fizz", i.toString())
            }

        }
    }
}
