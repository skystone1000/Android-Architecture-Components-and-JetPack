package com.example.architecturecomponents.a04viewmodelfactory

class A04Theory {

    /*
    ------------------------------------------------------------------------------
    04 Android ViewModel Factory Tutorial

    AGENDA
        ViewModel Factory
        Use of ViewModel Factory
        Examples

    For "ViewModel" we can not pass arguments directly to it as its objects are created
    by "ViewModelProvider" so we need ViewModelFactory when we need to pass arguments to viewModel

    data -> ViewModelFactory -> ViewModel Object


    class MainViewModelFactory(val counter:Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel(counter) as T
        }
    }


    mainViewModel = ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModel::class.java)


     */

}