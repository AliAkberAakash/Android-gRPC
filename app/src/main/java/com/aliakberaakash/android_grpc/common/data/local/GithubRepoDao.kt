package com.aliakberaakash.android_grpc.common.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoEntity

@Dao
interface GithubRepoDao {
    @Query("SELECT * FROM githubrepoentity")
    fun getAll() : List<GithubRepoEntity>

    @Insert
    fun insertAll(repositories : List<GithubRepoEntity>)
}