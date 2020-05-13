package com.rojer_ko.material.presentation.ui.barcelona

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rojer_ko.material.R

class BarcelonaFragment : Fragment() {

    private lateinit var toolsViewModel: BarcelonaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        toolsViewModel =
            ViewModelProviders.of(this).get(BarcelonaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_barcelona, container, false)
        val textView: TextView = root.findViewById(R.id.text_barcelona)
        toolsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}