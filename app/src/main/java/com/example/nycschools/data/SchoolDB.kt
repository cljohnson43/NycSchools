package com.example.nycschools.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [School::class], version = 3)
abstract class SchoolDB : RoomDatabase() {
    abstract fun schoolDao(): SchoolDao

    companion object {
        const val DB_NAME = "schools.db"
    }
}