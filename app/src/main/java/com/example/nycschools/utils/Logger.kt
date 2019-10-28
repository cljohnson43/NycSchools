package com.example.nycschools.utils

import android.util.Log

const val DEBUG_TAG = "debug_test"

object Logger {
    fun log(msg: String, tag: String = DEBUG_TAG){
        Log.d(tag, msg)
    }

    fun e(msg: String, tag: String = DEBUG_TAG) {
        Log.e(tag, msg)
    }

}