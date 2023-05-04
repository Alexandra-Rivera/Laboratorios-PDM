package com.example.laboratorio05_navigationcomponent.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.laboratorio05_navigationcomponent.R
import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.data.modelo.movies
import com.example.laboratorio05_navigationcomponent.repositories.MovieRepository


class NewMovieFragment : Fragment() {

    private lateinit var submitButton: Button
    private lateinit var movieName: EditText
    private lateinit var movieCategory: EditText
    private lateinit var movieDescription: EditText
    private lateinit var movieQualification: EditText


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind()
        submitButton.setOnClickListener {
            val newMovie = createMovie()
            MovieRepository(movies).addMovies(newMovie)
            printMovies()
//            val movieInspection = MovieRepository(movies).filterMovie(newMovie)
//            if (movieInspection != null) {
//                Toast.makeText(requireContext(), "La pelicula ya existe", Toast.LENGTH_LONG).show()
//            } else
//                printMovies()
        }
    }

    fun bind() {
        submitButton = view?.findViewById(R.id.buttonSubmit) as Button
        movieName = view?.findViewById(R.id.movieNamefr2) as EditText
        movieCategory = view?.findViewById(R.id.movieCategoryfr2) as EditText
        movieDescription = view?.findViewById(R.id.movieDescriptionfr2) as EditText
        movieQualification = view?.findViewById(R.id.movieQualificationfr2) as EditText
    }

    fun createMovie(): MovieModel {
        val movieName = movieName.text.toString()
        val movieCategory = movieCategory.text.toString()
        val movieDescription = movieDescription.text.toString()
        val movieQualification = movieQualification.text.toString()

        return MovieModel(movieName, movieCategory, movieDescription, movieQualification)
    }

    fun printMovies() {
        for(movie in movies) {
            Log.i("Movie item", movie.toString())
        }
    }

}