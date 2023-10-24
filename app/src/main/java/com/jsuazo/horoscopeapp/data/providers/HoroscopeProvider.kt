package com.jsuazo.horoscopeapp.data.providers

import com.jsuazo.horoscopeapp.domain.model.HoroscopeInfo
import com.jsuazo.horoscopeapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes():List<HoroscopeInfo>{
        return listOf(
            Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Sagittarius, Scorpio, Aquarius, Pisces, Capricorn
        )
    }
}