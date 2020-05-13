package com.rojer_ko.material.presentation.ui.trips

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rojer_ko.material.R
import kotlinx.android.synthetic.main.fragment_trips.*

class TripsFragment : Fragment() {

    private lateinit var tripsViewModel: TripsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tripsViewModel =
            ViewModelProviders.of(this).get(TripsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_trips, container, false)
        val textView: TextView = root.findViewById(R.id.text_trips)
        tripsViewModel.text.observe(this, Observer {
            textView.text = it
        })

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        useProgressBar()
    }

    private fun useProgressBar(){
        progressBarShowBtn.setOnClickListener {
            progressBarLine.visibility = View.VISIBLE
        }

        progressBarHideBtn.setOnClickListener {
            progressBarLine.visibility = View.INVISIBLE
        }
    }
}