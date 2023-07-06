package com.aliakberaakash.android_grpc.features.list.data.datasource

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import kotlinx.coroutines.flow.Flow

abstract class ListRemoteDataSource {
    abstract suspend fun getGithubRepo() : Flow<GithubRepoResponseEntity?>
}