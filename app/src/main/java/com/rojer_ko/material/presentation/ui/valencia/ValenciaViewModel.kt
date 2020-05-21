package com.rojer_ko.material.presentation.ui.valencia

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ValenciaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Valencia"
    }
    val text: LiveData<String> = _text
}