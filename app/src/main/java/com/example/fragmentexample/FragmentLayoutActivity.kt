package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
This project's Code referred and modified from following source , adding the links below

https://developer.android.com/guide/components/fragments#kotlin

https://github.com/Miserlou/Android-SDK-Samples/blob/master/ApiDemos/src/com/example/android/apis/Shakespeare.java

 */

class FragmentLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_layout)
    }
}