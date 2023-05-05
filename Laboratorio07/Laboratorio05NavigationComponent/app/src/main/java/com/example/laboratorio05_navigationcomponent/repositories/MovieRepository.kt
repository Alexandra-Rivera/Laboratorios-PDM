package com.example.laboratorio05_navigationcomponent.repositories

import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.data.modelo.movies


class MovieRepository (private var Movies: MutableList<MovieModel>) {
    fun getMovies() = Movies
    fun addMovies(Movie: MovieModel) = Movies.add(Movie)
}