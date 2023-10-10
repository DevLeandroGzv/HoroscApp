package com.leamdro.horoscapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.leamdro.horoscapp.domian.model.PredictionModel

data class PredictionResponse(
    @SerializedName("date") val date: String,
    @SerializedName("horoscope") val horoscope: String,
    @SerializedName("sign") val sign: String



){
    fun toDomain():PredictionModel{
        return PredictionModel(horoscope = horoscope,
        sign = sign)

    }

}
