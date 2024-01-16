package com.example.architecturecomponents.a06liveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.architecturecomponents.R

class A06MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: A06MainViewModel

    private val factsTextView : TextView
        get() = findViewById(R.id.factsTextView)

    private val btnUpdate : Button
        get() = findViewById(R.id.btnUpdate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a06_main)

        // mainViewModel = ViewModelProvider(this).get(A06MainViewModel::class.java)
        mainViewModel = ViewModelProvider(this)[A06MainViewModel::class.java] // Same as above line

        mainViewModel.factsLiveData.observe(this, {
            factsTextView.text = it
        })

        btnUpdate.setOnClickListener{
            mainViewModel.updateLiveData()
        }
    }
}