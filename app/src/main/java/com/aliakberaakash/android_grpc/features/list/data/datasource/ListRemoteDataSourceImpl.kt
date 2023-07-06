package com.aliakberaakash.android_grpc.features.list.data.datasource

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import com.aliakberaakash.android_grpc.features.list.data.service.GithubRepoService
import kotlinx.coroutines.flow.Flow

class ListRemoteDataSourceImpl(private val service : GithubRepoService) : ListRemoteDataSource() {

    override suspend fun getGithubRepo(): Flow<GithubRepoResponseEntity> {
        return service.getGithubRepo()
    }
}