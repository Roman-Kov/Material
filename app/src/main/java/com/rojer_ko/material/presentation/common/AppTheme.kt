package com.rojer_ko.material.presentation.common

import com.rojer_ko.material.R

var appTheme : Theme = Theme.LIGHT

enum class Theme{
    LIGHT, DARK
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