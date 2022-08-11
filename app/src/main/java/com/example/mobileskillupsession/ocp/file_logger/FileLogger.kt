package com.example.mobileskillupsession.ocp.file_logger

import java.io.File

open class FileLogger {
    open fun logToFile(error: String) {
        val file = File("log/error.text")
        file.writeText(error)
    }

    open fun logToFile(error: String, name: String) {
        val file = File("log/error.text")
        file.writeText(error)
    }
}