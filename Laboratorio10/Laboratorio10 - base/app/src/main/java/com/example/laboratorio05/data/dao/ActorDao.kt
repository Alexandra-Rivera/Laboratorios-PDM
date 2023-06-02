package com.example.laboratorio05.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.laboratorio05.data.model.ActorModel

@Dao
interface ActorDao {
    // TODO: create getAllActors method
    @Query("SELECT * FROM ACTOR_TABLE")
    suspend fun getAllActors(): List<ActorModel>

    // TODO: create insertActor method
    @Insert
    suspend fun insertActor(actor: ActorModel)
}