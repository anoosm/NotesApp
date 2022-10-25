package com.example.notesappwithroom.database

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.notesappwithroom.models.Notes

interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertNote(notes: Notes)

    @Update
    suspend fun updateNote(notes: Notes)

    @Delete
    suspend fun deleteNote(notes: Notes)

    @Query("select * from notesTable order by id ASC")
    fun getNotes(): LiveData<List<Notes>>
}