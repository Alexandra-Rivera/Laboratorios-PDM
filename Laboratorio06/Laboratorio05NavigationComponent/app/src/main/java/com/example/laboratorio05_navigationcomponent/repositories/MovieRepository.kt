package com.example.laboratorio05_navigationcomponent.repositories

import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.data.modelo.movies


class MovieRepository (private var Movies: MutableList<MovieModel>){
    fun getMovies() = Movies
    fun addMovies(Movie: MovieModel) = Movies.add(Movie)

//    fun filterMovie(NewMovie: MovieModel): MovieModel? {
//        val movieName = NewMovie.name
//        for (Movie in movies){
//            if (Movie.name == movieName) {
//                return Movie
//            } else{
//                addMovies(Movie)
//                return null
//            }
//        }
//    }
}