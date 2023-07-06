package com.aliakberaakash.android_grpc.features.list.data.repository

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import kotlinx.coroutines.flow.Flow

abstract class ListRepository {
    abstract suspend fun getGithubRepo() : Flow<GithubRepoResponseEntity>
}