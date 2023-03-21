package com.example.meditationui.ui

import androidx.compose.ui.graphics.Color
import androidx.annotation.DrawableRes

data class Features(
    val title:String,
    @DrawableRes val iconId:Int,
    val lightColor:Color,
    val mediumColor:Color,
    val darkColor:Color
)
