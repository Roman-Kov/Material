package com.rojer_ko.material.presentation

import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.rojer_ko.material.R
import com.rojer_ko.material.presentation.ui.gallery_2.*

class GalleryActivity : BaseActivity() {
    override val layoutRes: Int = R.layout.activity_gallary
    override val isAppBar: Boolean = false

    private val fragment1: GalleryFragment_1 = GalleryFragment_1.newInstance(null)
    private val fragment2: GalleryFragment_2 = GalleryFragment_2.newInstance(null)
    private val fragment3: GalleryFragment_3 = GalleryFragment_3.newInstance(null)
    private val adapter: GalleryFragmentPagerAdapter = GalleryFragmentPagerAdapter(supportFragmentManager)
    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViews()
        initAdapter()
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }

    private fun initViews(){
        viewPager = findViewById(R.id.view_pager)
        tabs = findViewById(R.id.tabs)
    }
    private fun initAdapter(){
        adapter.addFragment(fragment1, "Tab#1")
        adapter.addFragment(fragment2, "Tab#2")
        adapter.addFragment(fragment3, "Tab#3")
    }
}