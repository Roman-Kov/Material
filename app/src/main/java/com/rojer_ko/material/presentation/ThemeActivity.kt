package com.rojer_ko.material.presentation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.app.TaskStackBuilder
import com.rojer_ko.material.R
import com.rojer_ko.material.presentation.extensions.Theme
import com.rojer_ko.material.presentation.extensions.appTheme
import kotlinx.android.synthetic.main.activity_theme.*

class ThemeActivity : BaseActivity(), View.OnClickListener {

    override val layoutRes: Int = R.layout.activity_theme
    override val isAppBar: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViews()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.lightThemeBtn -> {
                appTheme = Theme.LIGHT
                refreshActivity()
            }
            R.id.darkThemeBtn -> {
                appTheme = Theme.DARK
                refreshActivity()
            }
        }
    }

    private fun initViews(){
        lightThemeBtn.setOnClickListener(this)
        darkThemeBtn.setOnClickListener(this)
    }

    private fun refreshActivity(){
        TaskStackBuilder.create(this)
            .addNextIntent(Intent(this, StartActivity::class.java))
            .addNextIntent(Intent(this, MainActivity::class.java))
            .addNextIntent(intent)
            .startActivities()
    }
}
