package com.innova.data.repository

import com.innova.data.api.CoinPaprikaApi
import com.innova.data.extensions.toCoin
import com.innova.domain.model.Coin
import com.innova.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }
}