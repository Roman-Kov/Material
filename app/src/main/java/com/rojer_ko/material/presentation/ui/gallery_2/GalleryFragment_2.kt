package com.rojer_ko.material.presentation.ui.gallery_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.rojer_ko.material.R
import com.rojer_ko.material.presentation.ui.gallery_2.fragment_2.*

class GalleryFragment_2 : Fragment() {
    companion object {
        fun newInstance(bundle: Bundle?): GalleryFragment_2 {
            val currentFragment = GalleryFragment_2()
            val args = Bundle()
            args.putBundle("gettedArgs", bundle)
            currentFragment.arguments = args
            return currentFragment
        }
    }

    private val fragmentAudioTrack: FragmentGalleryAudioTrack = FragmentGalleryAudioTrack.newInstance(null)
    private val fragmentEmail: FragmentGalleryEmail = FragmentGalleryEmail.newInstance(null)
    private val fragmentFavorites: FragmentGalleryFavorites = FragmentGalleryFavorites.newInstance(null)
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_gallery_2, container, false)

       requireActivity().supportFragmentManager
           .beginTransaction().add(R.id.containerFrame, fragmentEmail).commit()

        bottomNavigationView = rootView.findViewById(R.id.bnv)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_email -> {
                    requireActivity().supportFragmentManager
                        .beginTransaction().replace(R.id.containerFrame, fragmentEmail).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_music -> {
                    requireActivity().supportFragmentManager
                        .beginTransaction().replace(R.id.containerFrame, fragmentAudioTrack).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_favorites -> {
                    requireActivity().supportFragmentManager
                        .beginTransaction().replace(R.id.containerFrame, fragmentFavorites).commit()
                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }

        return rootView
    }
}

