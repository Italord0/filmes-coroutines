package com.italo.filmes.data.repository

import com.italo.filmes.data.model.Filme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainLocalDataSource @Inject constructor() : MainDataSource {

    // simulating api call using kotlin coroutines
    override suspend fun fetchFilmes(): List<Filme> {
        return withContext(Dispatchers.Default) {
            delay(3000)
            listOf(
                Filme(1, "Filme 1"),
                Filme(2, "Filme 2")
            )
        }
    }
}
