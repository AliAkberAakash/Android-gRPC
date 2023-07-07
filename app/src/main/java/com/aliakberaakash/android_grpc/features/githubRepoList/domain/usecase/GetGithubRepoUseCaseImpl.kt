package com.aliakberaakash.android_grpc.features.githubRepoList.domain.usecase

import com.aliakberaakash.android_grpc.features.githubRepoList.data.repository.GithubRepoListRepository
import com.aliakberaakash.android_grpc.features.githubRepoList.domain.entity.GithubRepoUiEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetGithubRepoUseCaseImpl(private val repo: GithubRepoListRepository) : GetGithubRepoUseCase() {
    override suspend fun getGithubRepo(): Flow<List<GithubRepoUiEntity>> {
        return repo.getGithubRepo().map { response ->
            response.map {
                GithubRepoUiEntity(
                    id = it.id,
                    name = it.name,
                    owner = it.owner,
                )
            }
        }
    }
}