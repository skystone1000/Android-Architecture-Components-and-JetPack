package com.example.architecturecomponents.a03viewmodel

class A03Theory {


    /*
------------------------------------------------------------------------------
03 Android ViewModel Tutorial Android Jetpack Components Hindi- CheezyCode #3

AGENDA
	What is ViewModel?
	Need of ViewModel
	Examples

Counter Application
	Counter(Variables) looses data when configuration is changed(like from landscape to portrait)
	to take care of that so that we do not loose info we have view model

View Model
	- Model for your views such as Activity or Fragment
	- View Models are lifecycle aware
	- Data required for your screen is stored at one place i.e. ViewModel.
	  It may involve formatting that data in a particular format, accumulating data,
	  any logic in displaying this data in your UI


    mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

    setText()
    txtCounter.text = mainViewModel.count.toString()


    */

}