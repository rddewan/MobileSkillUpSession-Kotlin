package com.example.mobileskillupsession

import java.io.File

class FileLogger {
    fun logToFile(error: String) {
        val file = File("log/error.text")
        file.writeText(error)
    }
}