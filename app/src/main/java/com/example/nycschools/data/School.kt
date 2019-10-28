package com.example.nycschools.data

import android.provider.CalendarContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = School.TABLE_NAME)
data class School private constructor(
    @PrimaryKey(autoGenerate = true) var id: Long? = null,
    @ColumnInfo(name = School.COLUMN_DBN) val dbn: String,
    @ColumnInfo(name = School.COLUMN_SCHOOL_NAME) val schoolName: String,
    @ColumnInfo(name = School.COLUMN_LOCATION) val location: String,
    @ColumnInfo(name = School.COLUMN_PHONE_NUMBER) val phoneNumber: String,
    @ColumnInfo(name = School.COLUMN_FAX_NUMBER) val faxNumber: String,
    @ColumnInfo(name = School.COLUMN_SCHOOL_EMAIL) val schoolEmail: String?,
    @ColumnInfo(name = School.COLUMN_WEBSITE) val website: String?,
    @ColumnInfo(name = School.COLUMN_TOTAL_STUDENTS) val totalStudents: String?,
    @ColumnInfo(name = School.COLUMN_EXTRACURRICULAR_ACTIVITIES) val extracurricularActivities: String?,
    @ColumnInfo(name = School.COLUMN_SCHOOL_SPORTS) val schoolSports: String?,
    @ColumnInfo(name = School.COLUMN_ATTENDANCE_RATE) val attendanceRate: String?,
    @ColumnInfo(name = School.COLUMN_ADDRESS) val address: String?,
    @ColumnInfo(name = School.COLUMN_CITY) val city: String?,
    @ColumnInfo(name = School.COLUMN_STATE_CODE) val stateCode: String?,
    @ColumnInfo(name = School.COLUMN_LATITUDE) val latitude: String?,
    @ColumnInfo(name = School.COLUMN_LONGITUDE) val longitude: String?,
    @ColumnInfo(name = School.COLUMN_ZIP) val zip: String?
) {
    constructor(
        dbn: String,
        schoolName: String,
        location: String,
        phoneNumber: String,
        faxNumber: String,
        schoolEmail: String?,
        website: String?,
        totalStudents: String?,
        extracurricularActivities: String?,
        schoolSports: String?,
        attendanceRate: String?,
        address: String?,
        city: String?,
        stateCode: String?,
        latitude: String?,
        longitude: String?,
        zip: String?
    ) : this(
        dbn = dbn,
        schoolName = schoolName,
        location = location,
        id = null,
        phoneNumber = phoneNumber,
        faxNumber = faxNumber,
        schoolEmail = schoolEmail,
        website = website,
        totalStudents = totalStudents,
        extracurricularActivities = extracurricularActivities,
        schoolSports = schoolSports,
        attendanceRate = attendanceRate,
        address = address,
        city = city,
        stateCode = stateCode,
        latitude = latitude,
        longitude = longitude,
        zip = zip
    )

    companion object {
        const val TABLE_NAME = "players"
        const val COLUMN_ID = "id"
        const val COLUMN_DBN = "dbn"
        const val COLUMN_SCHOOL_NAME = "school_name"
        const val COLUMN_LOCATION = "location"
        const val COLUMN_PHONE_NUMBER = "phone_number"
        const val COLUMN_FAX_NUMBER = "fax_number"
        const val COLUMN_SCHOOL_EMAIL = "school_email"
        const val COLUMN_WEBSITE = "website"
        const val COLUMN_TOTAL_STUDENTS = "total_students"
        const val COLUMN_EXTRACURRICULAR_ACTIVITIES = "extracurricular_activities"
        const val COLUMN_SCHOOL_SPORTS = "school_sports"
        const val COLUMN_ATTENDANCE_RATE = "attendance_rate"
        const val COLUMN_ADDRESS = "primary_address_line_1"
        const val COLUMN_CITY = "city"
        const val COLUMN_ZIP = "zip"
        const val COLUMN_STATE_CODE = "state_code"
        const val COLUMN_LATITUDE = "latitude"
        const val COLUMN_LONGITUDE = "longitude"

    }
}
