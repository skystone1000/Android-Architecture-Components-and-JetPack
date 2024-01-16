package com.example.architecturecomponents.a06liveData

class A06Theory {
/*
    06 Android LiveData Tutorial

    AGENDA
    LiveData
    LiveData & Mutable LiveData
    Examples

    LiveData
    - Observable Data Holder Class
    - Lifecycle aware (Components which are in active state)


    // -- ViewModel
    class MainViewModel : ViewModel() {
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

    // -- MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.factsLiveData.observe(this, {
            factsTextView.text = it
        })

        btnUpdate.setOnClickListener{
            mainViewModel.updateLiveData()
        }
    }


 */
}