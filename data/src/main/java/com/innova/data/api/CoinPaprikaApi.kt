package com.innova.data.api

import com.innova.data.model.CoinModel
import retrofit2.http.GET

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinModel>
}