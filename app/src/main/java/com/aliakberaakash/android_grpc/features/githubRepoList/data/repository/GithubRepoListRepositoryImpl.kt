package com.aliakberaakash.android_grpc.features.githubRepoList.data.repository

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.GithubRepoListRemoteDataSource
import kotlinx.coroutines.flow.Flow

class GithubRepoListRepositoryImpl(val remote : GithubRepoListRemoteDataSource) : GithubRepoListRepository() {
    override suspend fun getGithubRepo(): Flow<GithubRepoResponseEntity?> {
        // todo: if remote not available return from local
        return remote.getGithubRepo()
    }
}