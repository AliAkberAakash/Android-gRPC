package com.aliakberaakash.android_grpc.features.list.domain.usecase

import com.aliakberaakash.android_grpc.features.list.data.repository.ListRepository
import com.aliakberaakash.android_grpc.features.list.domain.entity.GithubRepoUiEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetGithubRepoUseCaseImpl(private val repo: ListRepository) : GetGithubRepoUseCase() {
    override suspend fun getGithubRepo(): Flow<List<GithubRepoUiEntity>> {
        return repo.getGithubRepo().map { response ->
            if (response?.items == null)
                return@map listOf()

            response.items.map {
                GithubRepoUiEntity(
                    id = it.id,
                    name = it.name,
                    owner = it.owner,
                )
            }

            // OR we could also map with the mapper:
            // GithubRepoUiEntityMapper.map(response)
        }
    }
}