package com.hiltexample.modules

import com.hiltexample.LoggerServer
import com.hiltexample.repo.FirebaseRepo
import com.hiltexample.repo.SqlRepo
import com.hiltexample.repo.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named


@Module
@InstallIn(ActivityComponent::class)
class UserModule {

    @Provides
    @Named("firebase")
    fun provideFirebaseRepo():UserRepository {
        return FirebaseRepo()
    }

    @Provides
    @Named("sql")
    fun provideSqlRepo(loggerServer: LoggerServer):UserRepository {
        return SqlRepo(loggerServer)
    }

//    @Binds
//    abstract fun bindsUserRepo(sqlRepo: SqlRepo):UserRepository
}