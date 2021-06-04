package com.italo.filmes.ui.main

import com.italo.filmes.data.Filme

interface MainRepositoryInterface {

    suspend fun getFilmes() : List<Filme>

}