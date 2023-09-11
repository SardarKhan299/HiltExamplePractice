package com.hiltexample.repo

interface UserRepository {
    fun saveUser(email:String,password:String)
}