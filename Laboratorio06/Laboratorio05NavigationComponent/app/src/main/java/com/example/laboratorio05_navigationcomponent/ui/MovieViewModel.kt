package com.example.laboratorio05_navigationcomponent.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.repositories.MovieRepository

class MovieViewModel (private val movieRepository: MovieRepository): ViewModel() {

    fun getMovies() = movieRepository.getMovies()

    fun addMovies(movie: MovieModel) = movieRepository.addMovies(movie)

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieViewModel
                MovieViewModel(app.movieRepository)
            }
        }
    }
}