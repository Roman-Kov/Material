package com.rojer_ko.material.presentation.common

import com.rojer_ko.material.R

enum class Theme{
    LIGHT, DARK
}

fun getThemeFromString(theme: String):Theme{

    when (theme){
        "LIGHT" -> return Theme.LIGHT
        "DARK" -> return Theme.DARK
    }
    return Theme.LIGHT
}

fun setMyTheme(theme : Theme, isAppBar : Boolean): Int {

    return if(isAppBar){
        when(theme){
            Theme.LIGHT -> R.style.AppTheme_MyLight
            Theme.DARK -> R.style.AppTheme_MyDark
        }
    }
    else{
        when(theme){
            Theme.LIGHT -> R.style.AppTheme_NoActionBarMyLight
            Theme.DARK -> R.style.AppTheme_NoActionBarMyDark
        }
    }
}