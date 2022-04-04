package com.innova.domain.repository

import com.innova.domain.model.Coin

interface CoinRepository {
    suspend fun getCoins(): List<Coin>
}