package com.italo.filmes.ui.main

import android.content.Context
import com.italo.filmes.data.Filme
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainRepository @Inject constructor(
    @ApplicationContext private val context: Context
) : MainRepositoryInterface {

    override suspend fun getFilmes(): List<Filme> {
        return withContext(Dispatchers.Default) {
            delay(3000)
            listOf(
                Filme(1, "Filme 1"),
                Filme(2, "Filme 2")
            )
        }
    }

}