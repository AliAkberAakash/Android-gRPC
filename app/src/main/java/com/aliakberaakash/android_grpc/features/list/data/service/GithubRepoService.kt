package com.aliakberaakash.android_grpc.features.list.data.service

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoEntity
import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import com.aliakberaakash.android_grpc.common.data.entity.RepoOwnerEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubRepoService {
    @GET("search/repositories")
    suspend fun getGithubRepo(
        @Query("q") keyword : String,
        @Query("per_page") perPage : Int,
    ) : GithubRepoResponseEntity?

}