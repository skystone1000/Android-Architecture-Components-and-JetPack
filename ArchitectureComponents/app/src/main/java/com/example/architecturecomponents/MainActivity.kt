package com.example.architecturecomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.architecturecomponents.a02lifecycleaware.A02MainActivity
import com.example.architecturecomponents.a03viewmodel.A03MainActivity
import com.example.architecturecomponents.a04viewmodelfactory.A04MainActivity
import com.example.architecturecomponents.a05quotify.A05MainActivity
import com.example.architecturecomponents.a06liveData.A06MainActivity
import com.example.architecturecomponents.a07databinding.A07MainActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<View>(R.id.btn_implementation1) as Button
        val button2 = findViewById<View>(R.id.btn_implementation2) as Button
        val button3 = findViewById<View>(R.id.btn_implementation3) as Button
        val button4 = findViewById<View>(R.id.btn_implementation4) as Button
        val button5 = findViewById<View>(R.id.btn_implementation5) as Button
        val button6 = findViewById<View>(R.id.btn_implementation6) as Button
        val button7 = findViewById<View>(R.id.btn_implementation7) as Button


        val listener= View.OnClickListener { view ->
            when (view.id) {
                R.id.btn_implementation1 -> {
                    Toast.makeText(this,"Check Theory File", Toast.LENGTH_LONG).show()
                }
                R.id.btn_implementation2 -> {
                    val intent = Intent(this, A02MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_implementation3 -> {
                    val intent = Intent(this, A03MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_implementation4 -> {
                    val intent = Intent(this, A04MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_implementation5 -> {
                    val intent = Intent(this, A05MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_implementation6 -> {
                    val intent = Intent(this, A06MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.btn_implementation7 -> {
                    val intent = Intent(this, A07MainActivity::class.java)
                    startActivity(intent)
                }
//                R.id.btn_implementation5 -> {
//                    // Method 1 - to instantiate a fragment
//                    // supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view, LocationFragment5()).commit()
//
//                    // Method 2 - using a wrapper function
//                    navigateTo(LocationFragment5(), true)
//                }
            }
        }

        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
        button3.setOnClickListener(listener)
        button4.setOnClickListener(listener)
        button5.setOnClickListener(listener)
        button6.setOnClickListener(listener)
        button7.setOnClickListener(listener)

    }
}