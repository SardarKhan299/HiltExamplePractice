package com.hiltexample.repo

import com.hiltexample.LoggerServer
import javax.inject.Inject

class SqlRepo @Inject constructor(val loggerServer: LoggerServer): UserRepository {
    override fun saveUser(email:String,password:String){
        loggerServer.log("User saved in DB...")
    }
}