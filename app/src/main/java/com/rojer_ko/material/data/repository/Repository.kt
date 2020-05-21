package com.rojer_ko.material.data.repository

import android.annotation.SuppressLint
import android.content.Context
import com.rojer_ko.material.App
import com.rojer_ko.material.R
import com.rojer_ko.material.data.model.Trip

object Repository {
    private val trips : MutableList<Trip>

    init {

        trips = mutableListOf()
        initTrips(App.getAppContext())
    }

    @SuppressLint("Recycle")
    private fun initTrips(context: Context){
        for (i in 0..5){
            trips.add(Trip(context.resources.getStringArray(R.array.trips_title)[i],
                context.resources.obtainTypedArray(R.array.trips_photo).getResourceId(i, 0),
                context.resources.getStringArray(R.array.trips_description)[i]))
        }
    }
    fun getTrips() : List<Trip>{
        return trips
    }

}