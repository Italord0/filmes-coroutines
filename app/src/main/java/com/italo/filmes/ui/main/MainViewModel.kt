package com.italo.filmes.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.italo.filmes.data.model.Filme
import com.italo.filmes.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (private val repository: MainRepository) : ViewModel() {

    val filmesLiveData = MutableLiveData<List<Filme>>()

    fun getFilmes(){
        CoroutineScope(Dispatchers.Main).launch {
            val filmes = withContext(Dispatchers.Default) {
                repository.getFilmes()
            }

            filmesLiveData.value = filmes

        }
    }

}