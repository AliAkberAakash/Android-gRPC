package com.aliakberaakash.android_grpc.features.githubRepoList.domain.usecase

import com.aliakberaakash.android_grpc.features.githubRepoList.domain.entity.GithubRepoUiEntity
import kotlinx.coroutines.flow.Flow

abstract class GetGithubRepoUseCase {
    abstract suspend fun getGithubRepo() : Flow<List<GithubRepoUiEntity>>
}