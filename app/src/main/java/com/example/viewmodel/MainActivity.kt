package com.example.viewmodel

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {


    lateinit var txtCounter: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        txtCounter = findViewById(R.id.txtCounter)
        mainViewModel.count.observe(this) {
            setText(it)
        }
    }

    fun setText(i: Int) {
        txtCounter.text = i.toString()
    }

    fun increment(view: View) {
        mainViewModel.increment()
    }
}