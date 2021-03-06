package com.innova.data_mock.di

import com.innova.data_mock.repository.CoinRepositoryImpl
import com.innova.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun provideCoinRepository(): CoinRepository = CoinRepositoryImpl()
}