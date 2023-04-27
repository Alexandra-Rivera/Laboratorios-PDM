package com.example.laboratorio05_navigationcomponent.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.laboratorio05_navigationcomponent.R
import com.example.laboratorio05_navigationcomponent.data.model.MovieModel
import com.example.laboratorio05_navigationcomponent.data.model.movies


class NewMovieFragment : Fragment() {

    private lateinit var enviarButton: Button
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
        enviarButton.setOnClickListener{
            val movieName = movieName.text.toString()
            val movieCategory = movieCategory.text.toString()
            val movieDescription = movieDescription.text.toString()
            val movieQualification = movieQualification.text.toString()

            val newMovie = MovieModel(movieName, movieCategory, movieDescription, movieQualification)
            val movieTest = MovieModel("Titanic", "Drama", "Romance entre dos pasajeros del titanic", "9.8")

            movies.add(newMovie)
        }
    }

    fun bind() {
        enviarButton = view?.findViewById(R.id.buttonSubmit) as Button
        movieName = view?.findViewById(R.id.movieNamefr2) as EditText
        movieCategory = view?.findViewById(R.id.movieCategoryfr2) as EditText
        movieDescription = view?.findViewById(R.id.movieDescriptionfr2) as EditText
        movieQualification = view?.findViewById(R.id.movieQualificationfr2) as EditText

    }

}