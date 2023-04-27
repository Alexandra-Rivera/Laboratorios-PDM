package com.example.laboratorio05_navigationcomponent.repositories

import com.example.laboratorio05_navigationcomponent.data.model.MovieModel

class MovieRepository (private var Movies: MutableList<MovieModel>){

    fun getMovies() = Movies

    fun addMovies(Movie: MovieModel) = Movies.add(Movie)
}