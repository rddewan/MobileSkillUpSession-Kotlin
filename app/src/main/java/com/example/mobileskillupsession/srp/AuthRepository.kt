package com.example.mobileskillupsession.srp

class AuthRepository(private val auth: Auth, private val fileLogger: FileLogger) {

    fun login(email:String, password: String) {
        try {
            auth.loginWithEmail(email,password)
        }catch (e: Exception) {
            fileLogger.logToFile(e.message.toString())
        }
    }


}