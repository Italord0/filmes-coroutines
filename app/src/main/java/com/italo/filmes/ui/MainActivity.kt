package com.italo.filmes.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.italo.filmes.R
import com.italo.filmes.databinding.ActivityMainBinding
import com.italo.filmes.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}