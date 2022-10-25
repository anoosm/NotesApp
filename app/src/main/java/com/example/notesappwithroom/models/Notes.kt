package com.example.notesappwithroom.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notesTable")
data class Notes(
    @ColumnInfo(name = "title") val noteTitle: String,
    @ColumnInfo(name = "description") val desctiption: String,
    @ColumnInfo(name = "timestamp") val timestamp: String,
    @PrimaryKey(autoGenerate = true) var id: Int = 0
)
