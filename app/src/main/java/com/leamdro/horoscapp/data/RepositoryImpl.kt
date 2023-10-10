package com.leamdro.horoscapp.data

import android.util.Log
import com.leamdro.horoscapp.data.network.HoroscopeApiService
import com.leamdro.horoscapp.data.network.response.PredictionResponse
import com.leamdro.horoscapp.domian.model.PredictionModel
import com.leamdro.horoscapp.domian.model.Repository
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService : HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String) : PredictionModel? {
        kotlin.runCatching { apiService.getHoroscope(sign) }
            .onSuccess {return it.toDomain()  }
            .onFailure { Log.i("Failure","ha ocurrido un error ${it.message}") }
        return null
    }
}