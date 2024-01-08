package com.example.architecturecomponents.a04viewmodelfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.architecturecomponents.R

class A04MainActivity : AppCompatActivity() {

    lateinit var txtCounter: TextView
    lateinit var mainViewModel: A04MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a04_main)
        mainViewModel = ViewModelProvider(this, A04MainViewModelFactory(10)).get(A04MainViewModel::class.java)
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