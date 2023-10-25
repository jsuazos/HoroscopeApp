package com.jsuazo.horoscopeapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest {

    @Test
    fun `getRandomCard should be return a random card`() {
        val randomCard = RandomCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)
    }
}