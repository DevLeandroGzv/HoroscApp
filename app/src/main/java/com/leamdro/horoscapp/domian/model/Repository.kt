package com.leamdro.horoscapp.domian.model

import com.leamdro.horoscapp.data.network.response.PredictionResponse

interface Repository {
     suspend fun getPrediction(sign:String): PredictionModel?
}