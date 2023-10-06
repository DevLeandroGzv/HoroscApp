package com.leamdro.horoscapp.data.providers

import com.leamdro.horoscapp.domian.model.HoroscopeInfo
import com.leamdro.horoscapp.domian.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor()  {
    fun getHoroscopes() : List<HoroscopeInfo>{
        return listOf(
            Aries,Taurus,Gemini,Cancer,Leo,Virgo,Libra,Scorpio,Sagittarius,Capricorn,Aquarius,Pisces
        )
    }
}