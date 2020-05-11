package com.rojer_ko.material.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rojer_ko.material.R
import com.rojer_ko.material.presentation.extensions.appTheme
import com.rojer_ko.material.presentation.extensions.setMyTheme

abstract class BaseActivity : AppCompatActivity() {

    abstract val layoutRes: Int
    abstract val isAppBar: Boolean

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.e("Error", isAppBar.toString())
        setTheme(setMyTheme(appTheme, isAppBar))
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)
    }
}