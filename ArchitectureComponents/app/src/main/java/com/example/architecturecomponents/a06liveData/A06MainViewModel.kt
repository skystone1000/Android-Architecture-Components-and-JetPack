package com.example.architecturecomponents.a06liveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class A06MainViewModel : ViewModel()  {
    // MutableLiveData can be changed from Main Activity as well so we do not prefer that
    // val factsLiveData = MutableLiveData<String>("This is a fact")

    private val factsLiveDataObject = MutableLiveData<String>("This is a fact")

    val factsLiveData : LiveData<String>
        get() = factsLiveDataObject

    fun updateLiveData(){
        // factsLiveData.value = "Another Fact"
        factsLiveDataObject.value = "Another Fact"
    }
}