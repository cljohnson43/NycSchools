package com.example.nycschools.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [School::class], version = 1)
abstract class SchoolDB : RoomDatabase() {
    abstract fun schoolDao(): SchoolDao
}