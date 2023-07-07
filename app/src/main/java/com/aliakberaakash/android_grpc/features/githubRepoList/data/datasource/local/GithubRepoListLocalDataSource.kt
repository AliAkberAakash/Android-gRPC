package com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.local

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoEntity
import kotlinx.coroutines.flow.Flow

abstract class GithubRepoListLocalDataSource {
    abstract fun getRepositories() : Flow<List<GithubRepoEntity>>
    abstract fun insertAllRepositories(repositories : List<GithubRepoEntity>) : Flow<Unit>
}