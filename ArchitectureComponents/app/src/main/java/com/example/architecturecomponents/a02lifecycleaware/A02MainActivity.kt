package com.example.architecturecomponents.a02lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.architecturecomponents.R

class A02MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a02_main)
        lifecycle.addObserver(A02Observer())
        Log.d("MAIN", "Activity OnCreate")
    }

    override fun onResume(){
        super.onResume()
        Log.d("MAIN", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "Activity onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN","Activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "Activity onDestroy")
    }
}