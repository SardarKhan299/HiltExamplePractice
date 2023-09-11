package com.hiltexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hiltexample.R
import com.hiltexample.repo.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("firebase")
    lateinit var userRepo: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userRepo.saveUser("","")
    }
}