package com.rojer_ko.material.presentation.ui.trips

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rojer_ko.material.R
import com.rojer_ko.material.data.model.Trip
import kotlinx.android.extensions.LayoutContainer


class TripAdapter: RecyclerView.Adapter<TripAdapter.TripViewHolder>() {

    var trips: List<Trip> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_trip, parent, false)
        return TripViewHolder(v)

    }

    override fun getItemCount(): Int {
        return trips.size
    }

    override fun onBindViewHolder(holder: TripViewHolder, position: Int) {
        holder.bind(trips[position])
    }

    inner class TripViewHolder(override val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer{
        private val title = containerView.findViewById<TextView>(R.id.tripTitle)
        private val photo = containerView.findViewById<ImageView>(R.id.tripPhoto)
        private val description = containerView.findViewById<TextView>(R.id.tripDescription)

        fun bind(trip : Trip){
            title.text = trip.title
            photo.setImageResource(trip.photo)
            description.text = trip.description
        }
    }
}