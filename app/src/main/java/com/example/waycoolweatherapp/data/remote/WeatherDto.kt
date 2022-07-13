package com.example.waycoolweatherapp.data.remote

import com.example.waycoolweatherapp.data.remote.WeatherDataDto
import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
