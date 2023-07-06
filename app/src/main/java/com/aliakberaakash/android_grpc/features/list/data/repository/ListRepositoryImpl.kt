package com.aliakberaakash.android_grpc.features.list.data.repository

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import com.aliakberaakash.android_grpc.features.list.data.datasource.ListRemoteDataSource
import kotlinx.coroutines.flow.Flow

class ListRepositoryImpl(val remote : ListRemoteDataSource) : ListRepository() {
    override suspend fun getGithubRepo(): Flow<GithubRepoResponseEntity> {
        // todo: if remote not available return from local
        return remote.getGithubRepo()
    }
}