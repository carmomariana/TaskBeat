package com.devspace.taskbeats

import androidx.room.Database
import androidx.room.RoomDatabase
@Database([CategoryEntity::class], version = 2)
abstract class TaskBeatDataBase : RoomDatabase() {

    abstract fun getCategoryDao(): CategoryDao

}