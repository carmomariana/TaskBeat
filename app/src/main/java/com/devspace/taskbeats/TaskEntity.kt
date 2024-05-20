package com.devspace.taskbeats

import androidx.room.Entity

@Entity
data class TaskEntity(
    val category: String,
    val name: String,
)
