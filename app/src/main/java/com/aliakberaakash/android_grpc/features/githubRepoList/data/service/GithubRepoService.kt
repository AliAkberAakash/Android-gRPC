package com.aliakberaakash.android_grpc.features.githubRepoList.data.service

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubRepoService {
    @GET("search/repositories")
    suspend fun getGithubRepo(
        @Query("q") keyword : String,
        @Query("per_page") perPage : Int,
    ) : GithubRepoResponseEntity?

}