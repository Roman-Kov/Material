package com.rojer_ko.material

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.rojer_ko.material.presentation.common.Theme
import com.rojer_ko.material.presentation.common.getThemeFromString

class App: Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: App? = null
        private val APP_PREFERENCES = "mysettings"
        private val APP_PREFERENCES_THEME = "theme"
        lateinit var pref: SharedPreferences

        fun getAppContext() : Context {
            return instance!!.applicationContext
        }

        fun setAppTheme(theme: Theme){
            val editor = pref.edit()
            editor.putString(APP_PREFERENCES_THEME, theme.toString())
            editor.apply()
        }

        fun getAppTheme(): Theme{
            return if(pref.contains(APP_PREFERENCES_THEME)){
                val theme: String = pref.getString(APP_PREFERENCES_THEME, "LIGHT").toString()
                getThemeFromString(theme)
            } else Theme.LIGHT
        }
    }

    override fun onCreate() {
        super.onCreate()

        pref = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
    }
}