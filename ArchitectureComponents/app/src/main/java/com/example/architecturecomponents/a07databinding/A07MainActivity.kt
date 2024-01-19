package com.example.architecturecomponents.a07databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.architecturecomponents.R
import com.example.architecturecomponents.a05quotify.Quote
import com.example.architecturecomponents.databinding.ActivityA07MainBinding

class A07MainActivity : AppCompatActivity() {

    // Name imported is created by dataBinding and start with the Activity{Name}Binding
    lateinit var binding:ActivityA07MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // --- OLD Approach
        // setContentView(R.layout.activity_a07_main)

        // val quoteTextView = findViewById<TextView>(R.id.quoteText)
        // val quoteAuthorView = findViewById<TextView>(R.id.quoteAuthor)

        // quoteTextView.text = "DO, or do not. There is no try"
        // quoteAuthorView.text = "Yoda"

        // --- New Approach
        // binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // binding.quoteText.text = "DO, or do not. There is no try"
        // binding.quoteAuthor.text = "Yoda"

        // Using in Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_a07_main)
        val quoteObj = Quote("DO, or do not. There is no try", "Yoda")
        binding.quote = quoteObj
    }
}