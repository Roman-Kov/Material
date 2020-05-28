package com.rojer_ko.material.presentation.ui.transport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rojer_ko.material.R
import kotlinx.android.synthetic.main.fragment_transport.*

class TransportFragment : Fragment() {

    private lateinit var transportViewModel: TransportViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        transportViewModel =
            ViewModelProviders.of(this).get(TransportViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_transport, container, false)
        val textView: TextView = root.findViewById(R.id.text_transport)
        transportViewModel.text.observe(this, Observer {
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