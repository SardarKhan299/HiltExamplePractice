package com.hiltexample.repo

import android.util.Log

class FirebaseRepo: UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(FirebaseRepo::class.simpleName, "saveUser: In Firebase.")
    }
}