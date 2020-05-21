package com.rojer_ko.material.presentation.ui.trips

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rojer_ko.material.data.model.Trip
import com.rojer_ko.material.data.repository.Repository

class TripsViewModel(application: Application) : AndroidViewModel(application) {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Trips"
    }

    val text: LiveData<String> = _text
}