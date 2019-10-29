package com.example.nycschools.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.room.Room
import com.example.nycschools.data.School
import com.example.nycschools.data.SchoolDB

class SchoolsViewModel(app: Application) : AndroidViewModel(app) {

    private val db: SchoolDB by lazy {
        Room.databaseBuilder(app.applicationContext, SchoolDB::class.java, SchoolDB.DB_NAME).build()
    }

    fun loadSchools(): List<School> = db.schoolDao().loadSchools()
    fun insertSchools(vararg schools: School) = db.schoolDao().insertSchools(*schools)
}