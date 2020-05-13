package com.rojer_ko.material.presentation.ui.barcelona

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BarcelonaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Barcelona"
    }
    val text: LiveData<String> = _text
}