package com.example.architecturecomponents.a04viewmodelfactory

import androidx.lifecycle.ViewModel

class A04MainViewModel(val initialValue:Int) : ViewModel() {
    var count:Int = initialValue

    fun increment(){
        count++
    }
}