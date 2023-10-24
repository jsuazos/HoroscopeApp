package com.jsuazo.horoscopeapp.domain.model

import com.jsuazo.horoscopeapp.data.network.response.PredictionResponse

interface Repository {
    suspend fun getPrediction(sign:String):PredictionModel?
}