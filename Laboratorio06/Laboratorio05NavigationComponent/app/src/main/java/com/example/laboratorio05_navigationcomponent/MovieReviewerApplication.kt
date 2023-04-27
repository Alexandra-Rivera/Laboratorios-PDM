package com.example.laboratorio05_navigationcomponent

import android.app.Application
import com.example.laboratorio05_navigationcomponent.data.model.getMovieList
import com.example.laboratorio05_navigationcomponent.repositories.MovieRepository

class MovieReviewerApplication: Application() {

    val movieRepository: MovieRepository by lazy {
        MovieRepository(getMovieList())
    }
}