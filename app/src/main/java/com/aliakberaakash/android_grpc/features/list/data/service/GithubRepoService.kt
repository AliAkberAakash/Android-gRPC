package com.aliakberaakash.android_grpc.features.list.data.service

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoEntity
import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity
import com.aliakberaakash.android_grpc.common.data.entity.RepoOwnerEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GithubRepoService {

    private val owner1 = RepoOwnerEntity(
        id = 1,
        login = "Braum",
    )

    private val owner2 = RepoOwnerEntity(
        id = 1,
        login = "Jinx",
    )

    private val repoList = listOf(
        GithubRepoEntity(
            id = 1,
            name = "Awesome Website",
            owner = owner1,
        ),
        GithubRepoEntity(
            id = 2,
            name = "Cool Mobile App",
            owner = owner2,
        ),
    )

    private val response = GithubRepoResponseEntity(
        totalCount = 2,
        items = repoList,
        incompleteResults = false,
    )

    suspend fun getGithubRepo() : Flow<GithubRepoResponseEntity>{
        return flow {
            emit(response)
        }
    }

}