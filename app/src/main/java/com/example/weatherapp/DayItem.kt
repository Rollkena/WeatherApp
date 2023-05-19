package com.example.weatherapp

import android.media.Image
import java.net.URL

data class DayItem (
    val city: String,
    val time: String,
    var condition: String,
    val image: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    var hours: String
)