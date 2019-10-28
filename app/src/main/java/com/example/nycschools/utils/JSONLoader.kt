package com.example.nycschools.utils

import com.example.nycschools.data.School
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.google.gson.reflect.TypeToken
import java.io.InputStream

inline fun <reified T> Gson.fromJson(json: String) = this.fromJson<T>(json, object: TypeToken<T>() {}.type)

class JSONLoader<T>(dataStream: InputStream) {
    lateinit var list: List<T>

    init {
        val bufferedReader = dataStream.bufferedReader()
        var str: String
        str = bufferedReader.readText()

        try {
            list = Gson().fromJson<List<T>>(str)

        }catch (e: JsonSyntaxException) {
            Logger.e(e.message ?: "unable to parse raw json file")
        }
        bufferedReader.close()
    }
}