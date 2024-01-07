package com.example.architecturecomponents.a03viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.architecturecomponents.R

class A03MainActivity : AppCompatActivity() {
    /*
    // Initial No View Model
    var count:Int =0
    lateinit var txtCounter:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtCounter = findViewById(R.id.txtCounter)
        setText()
    }
    fun increment(v: View){
        count++
        setText()
    }
    fun setText(){
        txtCounter.text = count.toString()
    }
     */

    // With ViewModel
    lateinit var txtCounter: TextView
    lateinit var mainViewModel: A03MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a03_main)
        mainViewModel = ViewModelProvider(this).get(A03MainViewModel::class.java)
        txtCounter = findViewById(R.id.txtCounter)
        setText()
    }
    fun setText(){
        txtCounter.text = mainViewModel.count.toString()
    }
    fun increment(v: View){
        mainViewModel.increment()
        setText()
    }
}