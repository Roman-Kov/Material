package com.rojer_ko.material.presentation.ui.madrid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rojer_ko.material.R

class MadridFragment : Fragment() {

    private lateinit var madridViewModel: MadridViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        madridViewModel =
            ViewModelProviders.of(this).get(MadridViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_madrid, container, false)
        val textView: TextView = root.findViewById(R.id.text_madrid)
        madridViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}