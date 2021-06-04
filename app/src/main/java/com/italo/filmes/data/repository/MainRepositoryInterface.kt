package com.italo.filmes.data.repository

import com.italo.filmes.data.model.Filme

interface MainRepositoryInterface {

    suspend fun getFilmes() : List<Filme>

}