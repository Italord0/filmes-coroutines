package com.italo.filmes.data.repository

import com.italo.filmes.data.model.Filme
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val mainLocalDataSource: MainLocalDataSource
) : MainRepositoryInterface {

    override suspend fun getFilmes(): List<Filme> {
        return mainLocalDataSource.fetchFilmes()
    }

}