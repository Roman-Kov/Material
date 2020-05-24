package com.rojer_ko.material.presentation.ui.trips

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rojer_ko.material.R
import com.rojer_ko.material.data.repository.Repository
import kotlinx.android.synthetic.main.fragment_trips.*

class TripsFragment : Fragment() {

    private lateinit var tripsViewModel: TripsViewModel
    private val tripLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this.context,
        LinearLayoutManager.VERTICAL ,false)

    private val tripAdapter: TripAdapter = TripAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        tripsViewModel =
//            ViewModelProviders.of(this).get(TripsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_trips, container, false)
//        val textView: TextView = root.findViewById(R.id.text_trips)
//        tripsViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        text_trips.text = "This is Trips"
        initRecyclerView()
    }

    fun initRecyclerView(){
        tripRecyclerView.layoutManager = tripLayoutManager
        tripAdapter.trips = Repository.getTrips()
        tripRecyclerView.adapter = tripAdapter
    }

}