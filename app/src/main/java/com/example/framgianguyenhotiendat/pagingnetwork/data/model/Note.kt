package com.example.framgianguyenhotiendat.pagingnetwork.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "note")
data class Note(
        @PrimaryKey(autoGenerate = false)
        var id : Int,
        var title: String,
        var state: Boolean = false
)
