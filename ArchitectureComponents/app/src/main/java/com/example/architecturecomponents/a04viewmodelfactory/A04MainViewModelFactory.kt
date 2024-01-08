package com.example.architecturecomponents.a04viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class A04MainViewModelFactory(val counter:Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return A04MainViewModel(counter) as T
    }
}