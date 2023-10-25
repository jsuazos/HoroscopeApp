package com.jsuazo.horoscopeapp.data.network.response

import com.jsuazo.horoscopeapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Test

class PredictionResponseTest {
    @Test
    fun `toDomain should a return a correct PredictionModel`() {
        //Given
        val predictionResponse = HoroscopeMotherObject.anyResponse

        //When
        val predictionModel = predictionResponse.toDomain()

        //Then
        predictionModel.sign shouldBe predictionResponse.sign
        predictionModel.horoscope shouldBe predictionResponse.horoscope

    }
}