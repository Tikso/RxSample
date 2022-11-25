package com.study.rxsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        simpleSyncList()
    }
// simple synchronous list
    private fun simpleSyncList(){
        var list = listOf(1, 2, 3)
        for (number in list) {
            println(number)
            list = listOf(4, 5, 6)
        }
        print(list)

    }
}