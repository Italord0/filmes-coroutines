package com.italo.filmes.data.repository

import com.italo.filmes.data.model.Filme

interface MainDataSource {

    suspend fun fetchFilmes() : List<Filme>

}