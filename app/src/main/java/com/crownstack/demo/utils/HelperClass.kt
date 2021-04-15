package com.crownstack.demo.utils

import android.content.Context
import java.io.IOException

class HelperClass {
    fun getJsonDataForPlayers(context: Context, rawfile: Int): String? {
        val jsonString: String
        try {
            jsonString = context.resources.openRawResource(rawfile).bufferedReader()
                .use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }
}