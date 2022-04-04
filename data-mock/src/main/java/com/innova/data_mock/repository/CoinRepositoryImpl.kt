package com.innova.data_mock.repository

import com.innova.domain.model.Coin
import com.innova.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl@Inject constructor() : CoinRepository {

    val coinList = arrayListOf(
        Coin("1", false, "Bitcoin", 12, "BTC"),
        Coin("2", true, "Dogecoin", 12, "DOGE")
    )

    override suspend fun getCoins(): List<Coin> = coinList
}