package com.example.architecturecomponents.a03viewmodel

import androidx.lifecycle.ViewModel

class A03MainViewModel : ViewModel(){
    var count:Int =0

    fun increment(){
        count++
    }
}