package com.example.nycschools.data

import android.provider.CalendarContract
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = School.TABLE_NAME)
data class School private constructor(
    @PrimaryKey(autoGenerate = true) var id: Long? = null,
    @ColumnInfo(name = School.COLUMN_DBN) val dbn: String?,
    @ColumnInfo(name = School.COLUMN_SCHOOL_NAME) val school_name: String?,
    @ColumnInfo(name = School.COLUMN_LOCATION) val location: String?,
    @ColumnInfo(name = School.COLUMN_PHONE_NUMBER) val phone_number: String?,
    @ColumnInfo(name = School.COLUMN_FAX_NUMBER) val fax_number: String?,
    @ColumnInfo(name = School.COLUMN_SCHOOL_EMAIL) val school_email: String?,
    @ColumnInfo(name = School.COLUMN_WEBSITE) val website: String?,
    @ColumnInfo(name = School.COLUMN_TOTAL_STUDENTS) val total_students: String?,
    @ColumnInfo(name = School.COLUMN_EXTRACURRICULAR_ACTIVITIES) val extracurricular_activities: String?,
    @ColumnInfo(name = School.COLUMN_SCHOOL_SPORTS) val school_sports: String?,
    @ColumnInfo(name = School.COLUMN_ATTENDANCE_RATE) val attendance_rate: String?,
    @ColumnInfo(name = School.COLUMN_ADDRESS) val primary_address_line_1: String?,
    @ColumnInfo(name = School.COLUMN_CITY) val city: String?,
    @ColumnInfo(name = School.COLUMN_STATE_CODE) val state_code: String?,
    @ColumnInfo(name = School.COLUMN_LATITUDE) val latitude: String?,
    @ColumnInfo(name = School.COLUMN_LONGITUDE) val longitude: String?,
    @ColumnInfo(name = School.COLUMN_ZIP) val zip: String?
) {
    constructor(
        dbn: String?,
        school_name: String?,
        location: String?,
        phone_number: String?,
        fax_number: String?,
        school_email: String?,
        website: String?,
        total_students: String?,
        extracurricular_activities: String?,
        school_sports: String?,
        attendance_rate: String?,
        primary_address_line_1: String?,
        city: String?,
        state_code: String?,
        latitude: String?,
        longitude: String?,
        zip: String?
    ) : this(
        dbn = dbn,
        school_name = school_name,
        location = location,
        id = null,
        phone_number = phone_number,
        fax_number = fax_number,
        school_email = school_email,
        website = website,
        total_students = total_students,
        extracurricular_activities = extracurricular_activities,
        school_sports = school_sports,
        attendance_rate = attendance_rate,
        primary_address_line_1 = primary_address_line_1,
        city = city,
        state_code = state_code,
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
