package com.example.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val countObject = MutableLiveData<Int>(0)

    val count : LiveData<Int> get() = countObject

    fun increment() {
        countObject.value = countObject.value?.plus(1)
    }
}