package com.rojer_ko.material.presentation.ui.gallery_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rojer_ko.material.R

class GalleryFragment_1 : Fragment() {

    companion object {
        fun newInstance(bundle: Bundle?): GalleryFragment_1 {
            val currentFragment = GalleryFragment_1()
            val args = Bundle()
            args.putBundle("gettedArgs", bundle)
            currentFragment.arguments = args
            return currentFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery_1, container, false)
    }
}