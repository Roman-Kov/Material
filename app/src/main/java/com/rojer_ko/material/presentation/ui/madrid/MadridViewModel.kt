package com.rojer_ko.material.presentation.ui.madrid

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MadridViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Madrid"
    }
    val text: LiveData<String> = _text
}