package com.example.notesappwithroom.database

import androidx.lifecycle.LiveData
import com.example.notesappwithroom.models.Notes

class NotesRepository(private val notesDao: NotesDao) {

    val allNotes: LiveData<List<Notes>> = notesDao.getNotes()

    suspend fun insert(notes: Notes) {
        notesDao.insertNote(notes)
    }

    suspend fun delete(notes: Notes) {
        notesDao.deleteNote(notes)
    }

    suspend fun update(notes: Notes) {
        notesDao.updateNote(notes)
    }
}