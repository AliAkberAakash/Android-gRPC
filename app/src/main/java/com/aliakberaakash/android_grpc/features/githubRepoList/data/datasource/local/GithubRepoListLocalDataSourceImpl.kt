package com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.local

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoEntity
import com.aliakberaakash.android_grpc.common.data.local.AppDatabase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GithubRepoListLocalDataSourceImpl(private val appDatabase: AppDatabase) : GithubRepoListLocalDataSource() {
    override fun getRepositories(): Flow<List<GithubRepoEntity>> = flow{
        emit(appDatabase.repoDao().getAll())
    }

    override fun insertAllRepositories(repositories: List<GithubRepoEntity>) = flow {
        appDatabase.repoDao().insertAll(repositories)
        emit(Unit)
    }
}