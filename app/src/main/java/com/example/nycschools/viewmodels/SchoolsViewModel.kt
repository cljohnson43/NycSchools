package com.example.nycschools.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.room.Room
import com.example.nycschools.R
import com.example.nycschools.data.School
import com.example.nycschools.data.SchoolDB
import com.example.nycschools.utils.Logger
import com.example.nycschools.utils.fromJSonList
import java.io.InputStream

class SchoolsViewModel(app: Application) : AndroidViewModel(app) {

    private val db: SchoolDB by lazy {
        // Move off of the main thread using coroutines
        Room.databaseBuilder(app.applicationContext, SchoolDB::class.java, SchoolDB.DB_NAME)
            .allowMainThreadQueries().build()
    }

    init {
        val numSchools = db.schoolDao().numSchools()
        if (numSchools < 1) {
            val dataStream: InputStream = app.resources.openRawResource(R.raw.nyc_school)
            val bufferedReader = dataStream.bufferedReader()
            val str = bufferedReader.readText()
            val schools: ArrayList<School> = fromJSonList(str, School::class.java)
            dataStream.close()

            db.schoolDao().insertSchools(*schools.toTypedArray())
        }
    }

    fun loadSchools(): List<School> = db.schoolDao().loadSchools()
    fun insertSchools(vararg schools: School) = db.schoolDao().insertSchools(*schools)
}