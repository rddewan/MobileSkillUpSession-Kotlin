package com.example.mobileskillupsession.ocp.file_logger

import java.io.File

class CutomFileLogger: FileLogger() {

    override fun logToFile(error: String) {
        //super.logToFile(error)
        val file = File("logs/errors.text")
        file.writeText(error)
    }
}