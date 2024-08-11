package com.example.mynotesapp.repository

import com.example.mynotesapp.database.NoteDatabase
import com.example.mynotesapp.model.Note


class NoteRepository(private val db:NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().insertNote(note)

    fun getAllNotes() = db.getNoteDao().getALLNotes()
    fun searchNotes(query: String?) = db.getNoteDao().searchNotes(query)
}