package com.example.laboratorio05.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.laboratorio05.data.model.MovieModel

@Dao
interface MovieDao {
    @Query("SELECT * FROM MOVIE_TABLE")
    suspend fun getAllMovies(): List<MovieModel>

    @Transaction
    @Insert
    suspend fun insertMovie(Movie: MovieModel)

    @Query("SELECT * FROM MOVIE_TABLE WHERE movieId = :id")
    suspend fun getMovieWithActorById(id: Int): MovieModel?
}