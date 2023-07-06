package com.aliakberaakash.android_grpc.features.list.data.datasource

import com.aliakberaakash.android_grpc.features.list.data.service.GithubRepoService
import kotlinx.coroutines.flow.flow

class ListRemoteDataSourceImpl(private val service: GithubRepoService) : ListRemoteDataSource() {

    override suspend fun getGithubRepo() = flow {
        emit(
            service.getGithubRepo(
                keyword = "android",
                perPage = 10,
            ),
        )
    }
}