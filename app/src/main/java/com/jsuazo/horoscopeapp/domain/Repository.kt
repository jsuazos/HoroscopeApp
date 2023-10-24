package com.jsuazo.horoscopeapp.domain

import com.jsuazo.horoscopeapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}