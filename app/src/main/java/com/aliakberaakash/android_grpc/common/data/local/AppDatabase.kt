package com.aliakberaakash.android_grpc.common.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoEntity

@Database(entities = [GithubRepoEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun repoDao() : GithubRepoDao
}