package com.hiltexample

import android.util.Log
import javax.inject.Inject


class LoggerServer @Inject constructor() {

    fun log(message:String){
        Log.d(LoggerServer::class.simpleName, "log: $message")
    }
}