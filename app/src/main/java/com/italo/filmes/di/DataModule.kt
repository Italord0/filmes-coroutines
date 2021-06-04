package com.italo.filmes.di

import com.italo.filmes.ui.main.MainRepository
import com.italo.filmes.ui.main.MainRepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.Provides
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

}