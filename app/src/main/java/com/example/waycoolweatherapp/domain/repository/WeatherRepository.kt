package com.example.waycoolweatherapp.domain.repository

import com.example.waycoolweatherapp.domain.utils.Resource
import com.plcoding.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}