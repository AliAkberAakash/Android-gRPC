package com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource

import com.aliakberaakash.android_grpc.features.githubRepoList.data.service.GithubRepoService
import kotlinx.coroutines.flow.flow

class GithubRepoListRemoteDataSourceImpl(private val service: GithubRepoService) : GithubRepoListRemoteDataSource() {

    override suspend fun getGithubRepo() = flow {
        emit(
            service.getGithubRepo(
                keyword = "android",
                perPage = 10,
            ),
        )
    }
}