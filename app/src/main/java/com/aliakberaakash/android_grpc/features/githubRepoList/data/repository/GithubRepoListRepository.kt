package com.aliakberaakash.android_grpc.features.githubRepoList.data.repository

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoEntity
import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import kotlinx.coroutines.flow.Flow

abstract class GithubRepoListRepository {
    abstract suspend fun getGithubRepo() : Flow<List<GithubRepoEntity>>
}