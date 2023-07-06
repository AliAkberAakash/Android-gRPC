package com.aliakberaakash.android_grpc.application

import android.app.Application
import com.aliakberaakash.android_grpc.features.githubRepoList.di.githubRepoListModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(githubRepoListModule)
        }

    }
}