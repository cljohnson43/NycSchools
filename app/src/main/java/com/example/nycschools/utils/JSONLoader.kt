package com.example.nycschools.utils

import com.example.nycschools.data.School
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import java.io.InputStream

//inline fun <reified T> Gson.fromJson(json: String) = this.fromJson<T>(json, object: TypeToken<T>() {}.type)
fun <T> fromJSonList(json: String, myType: Class<T>): List<T> {
    val gson = Gson()
    val collectionType = TypeToken.getParameterized(List::class.java, myType).type
    return gson.fromJson(json, collectionType)
}
