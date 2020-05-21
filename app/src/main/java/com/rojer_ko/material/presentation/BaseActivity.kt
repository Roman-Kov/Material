package com.rojer_ko.material.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rojer_ko.material.presentation.common.appTheme
import com.rojer_ko.material.presentation.common.setMyTheme

abstract class BaseActivity : AppCompatActivity() {

    abstract val layoutRes: Int
    abstract val isAppBar: Boolean

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(setMyTheme(appTheme, isAppBar))
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)
    }
}