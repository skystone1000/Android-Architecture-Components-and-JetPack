package com.example.architecturecomponents.a07databinding

class A07Theory {
    /*
------------------------------------------------------------------------------
07 Android Data Binding Tutorial

AGENDA
	Data Binding
	Examples

Data Binding
	- Support Library that allows you to bind UI components in your
	layouts to data sources in your app using a declarative format
	rather than programatically

	Till now
	val emailTextView = findViewById<TextView>(R.id.email_text_view)
	emailTextView.text = model.emailAddress

	Updated
	<TextView android:yexy = "@{model.emailAddress}"

	- Benefits
		No need of "findViewById"
		Binding is compile time so no NULL pointer Exception
		Performance and No memory Leaks


    // --Quote
    data class Quote(val text:String, val author:String) {}

// --MainActivity
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    val quoteObj = Quote("DO, or do not. There is no try", "Yoda")
    binding.quote = quoteObj

// --activity_main.xml
    <data>
    <variable
    name="quote"
    type="com.example.a07databindingexample.Quote" />
    </data>

    <LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
    android:id="@+id/quoteText"
    android:text="@{quote.text}"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textSize="28sp"
    android:textStyle="bold" />

    <TextView
    android:id="@+id/quoteAuthor"
    android:text="@{quote.author}"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_marginTop="16dp"
    android:textSize="26sp" />
    </LinearLayout>

*/
}