package com.example.nycschools.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SchoolDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertSchools(vararg schools: School)

    @Query("SELECT * FROM ${School.TABLE_NAME}")
    fun loadSchools(): List<School>

    @Query("SELECT COUNT(*) FROM ${School.TABLE_NAME}")
    fun numSchools(): Int
}