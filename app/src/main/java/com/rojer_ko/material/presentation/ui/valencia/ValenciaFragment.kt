package com.rojer_ko.material.presentation.ui.valencia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rojer_ko.material.R

class ValenciaFragment : Fragment() {

    private lateinit var valenciaViewModel: ValenciaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        valenciaViewModel =
            ViewModelProviders.of(this).get(ValenciaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_valencia, container, false)
        val textView: TextView = root.findViewById(R.id.text_valencia)
        valenciaViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}