package com.hiltexample.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class MyApp: Application() {


    override fun onCreate() {
        super.onCreate()

    }
}