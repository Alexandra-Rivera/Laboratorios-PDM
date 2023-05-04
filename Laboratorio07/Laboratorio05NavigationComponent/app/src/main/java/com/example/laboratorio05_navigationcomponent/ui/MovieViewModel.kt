package com.example.laboratorio05_navigationcomponent.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.repositories.MovieRepository

class MovieViewModel (private val movieRepository: MovieRepository): ViewModel() {
    var name = MutableLiveData("")
    var category = MutableLiveData("")
    var description = MutableLiveData(" ")
    var qualification = MutableLiveData(" ")
    var status = MutableLiveData(" ")

    //Para poder conectar los datos de LiveData a la UI hacemos uso de DataBinding
    //Ahora el ViewModel esta suscrito a datos de tipo LiveData

    fun getMovies() = movieRepository.getMovies()

    private fun addMovies(movie: MovieModel) = movieRepository.addMovies(movie)

    fun createMovie() {
        if (!validateData()){
            status.value = WRONG_INFORMATION
            return //este return va a parar el proceso (no se va a ejecutar el resto del if)
        }

        val movie = MovieModel(
            name.value!!,
            category.value!!,
            description.value!!,
            qualification.value!!
        )

        addMovies(movie)
        clearData()
        status.value = MOVIE_CREATED //Aqui se define el estado de que la Movie ha sido creada :0
    }

    //ClearData hace que cuando finalice el proceso de aniadir una nueva pelicula a la lista, los campos pasaran a estar vacios
    private fun clearData(){
        name.value = ""
        category.value = ""
        description.value = ""
        qualification.value = ""
    }

    fun clearStatus() {
        status.value = INACTIVE
    }

    //ValidateData verifica si el campo esta nulo (vacio) y si lo esta, va a retornar false. Con que uno de los datos este en false, siempre va a retornar false

    private fun validateData(): Boolean {
        when {
            name.value.isNullOrEmpty() -> return false
            category.value.isNullOrEmpty() -> return false
            description.value.isNullOrEmpty() -> return false
            qualification.value.isNullOrEmpty() -> return false
        }
        return true
    }

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieViewModel
                MovieViewModel(app.movieRepository)
            }
        }
        const val MOVIE_CREATED = "Movie created"
        const val WRONG_INFORMATION = "Wrong information"
        const val INACTIVE = ""    //El estado inactivo hace que limpiemos el estado de LiveData, que puede estar en WRONG_INFORMATION o MOVIE_CREATED, y seteamos un estado inactivo
    }
}