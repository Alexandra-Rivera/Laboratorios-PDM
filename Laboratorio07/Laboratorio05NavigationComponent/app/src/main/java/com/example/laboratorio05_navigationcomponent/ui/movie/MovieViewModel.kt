package com.example.laboratorio05_navigationcomponent.ui.movie

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio05_navigationcomponent.MovieReviewerApplication
import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.repositories.MovieRepository

class MovieViewModel (private val movieRepository: MovieRepository): ViewModel() {
    var name = MutableLiveData("")
    var category = MutableLiveData("")
    var description = MutableLiveData("")
    var qualification = MutableLiveData("")
    var status = MutableLiveData("")


    fun getMovies() = movieRepository.getMovies()

    private fun addMovies(movie: MovieModel) = movieRepository.addMovies(movie)

    fun createMovie() {
        if (!validateData()){
            status.value = WRONG_INFORMATION
            return
        }

        val movie = MovieModel(
            name.value!!,
            category.value!!,
            description.value!!,
            qualification.value!!
        )

        addMovies(movie)
        clearData()
        status.value = MOVIE_CREATED
    }


    private fun validateData(): Boolean {
        when {
            name.value.isNullOrEmpty() -> return false
            category.value.isNullOrEmpty() -> return false
            description.value.isNullOrEmpty() -> return false
            qualification.value.isNullOrEmpty() -> return false
        }
        return true
    }

    private fun clearData(){
        name.value = ""
        category.value = ""
        description.value = ""
        qualification.value = ""
    }

    fun clearStatus() {
        status.value = INACTIVE
    }

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieReviewerApplication
                MovieViewModel(app.movieRepository)
            }
        }
        const val MOVIE_CREATED = "Movie created"
        const val WRONG_INFORMATION = "Wrong information"
        const val INACTIVE = ""
    }
}