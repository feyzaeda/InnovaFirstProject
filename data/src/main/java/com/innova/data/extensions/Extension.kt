package com.innova.data.extensions

import com.innova.data.model.CoinModel
import com.innova.domain.model.Coin

fun CoinModel.toCoin(): Coin {
    return Coin(
        id, isActive, name, rank, symbol
    )
}