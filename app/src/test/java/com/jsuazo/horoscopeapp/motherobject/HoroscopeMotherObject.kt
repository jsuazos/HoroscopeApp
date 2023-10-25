package com.jsuazo.horoscopeapp.motherobject

import com.jsuazo.horoscopeapp.data.network.response.PredictionResponse
import com.jsuazo.horoscopeapp.domain.model.HoroscopeInfo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        HoroscopeInfo.Aries,
        HoroscopeInfo.Taurus,
        HoroscopeInfo.Gemini,
        HoroscopeInfo.Cancer,
        HoroscopeInfo.Leo,
        HoroscopeInfo.Virgo,
        HoroscopeInfo.Libra,
        HoroscopeInfo.Sagittarius,
        HoroscopeInfo.Scorpio,
        HoroscopeInfo.Aquarius,
        HoroscopeInfo.Pisces,
        HoroscopeInfo.Capricorn
    )
}