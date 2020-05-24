package com.rojer_ko.material.presentation.ui.gallery_2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class GalleryFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){

    private val fragments : ArrayList<Fragment> = arrayListOf()
    private val tabTitles : ArrayList<String> = arrayListOf()

    fun addFragment(fragment: Fragment, tabTitle: String) {
        fragments.add(fragment)
        tabTitles.add(tabTitle)
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }
}