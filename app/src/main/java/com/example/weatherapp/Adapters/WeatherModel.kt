package com.example.weatherapp.Adapters

data class WeatherModel(
    var city: String,
    val time: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val imageUrl: String,
    var hours: String
)