package com.rojer_ko.material.presentation.ui.gallery_2.fragment_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rojer_ko.material.R

class FragmentGalleryFavorites: Fragment() {

    companion object {
        fun newInstance(bundle: Bundle?): FragmentGalleryFavorites {
            val currentFragment = FragmentGalleryFavorites()
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
        return inflater.inflate(R.layout.fragment_gallery_favorites, container, false)
    }
}