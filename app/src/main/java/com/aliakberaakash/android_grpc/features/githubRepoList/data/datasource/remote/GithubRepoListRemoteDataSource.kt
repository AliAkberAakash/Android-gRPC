package com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.remote

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import kotlinx.coroutines.flow.Flow

abstract class GithubRepoListRemoteDataSource {
    abstract suspend fun getGithubRepo() : Flow<GithubRepoResponseEntity?>
}