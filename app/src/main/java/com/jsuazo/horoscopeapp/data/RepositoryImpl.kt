package com.jsuazo.horoscopeapp.data

import android.util.Log
import com.jsuazo.horoscopeapp.data.network.HoroscopeApiService
import com.jsuazo.horoscopeapp.domain.Repository
import com.jsuazo.horoscopeapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("error", "Ha ocurrido un error: ${it.message}") }
        return null

    }
}