package com.italo.filmes.di

import com.italo.filmes.data.repository.MainDataSource
import com.italo.filmes.data.repository.MainRepository
import com.italo.filmes.data.repository.MainRepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Singleton
    @Binds
    abstract fun bindMainRepository(
        mainRepository: MainRepository
    ): MainRepositoryInterface

    @Singleton
    @Binds
    abstract fun bindDataSource(
        dataSource: MainDataSource
    ): MainDataSource

}