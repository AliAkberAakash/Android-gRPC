package com.aliakberaakash.android_grpc.features.githubRepoList.data.repository

import android.util.Log
import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoEntity
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.local.GithubRepoListLocalDataSource
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.remote.GithubRepoListRemoteDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
class GithubRepoListRepositoryImpl(
    private val remote: GithubRepoListRemoteDataSource,
    private val local: GithubRepoListLocalDataSource
) :
    GithubRepoListRepository() {

    private val TAG = "GithubRepoListRepositoryImpl"
    override suspend fun getGithubRepo(): Flow<List<GithubRepoEntity>> {

        return flow {
            remote.getGithubRepo()
                .flowOn(Dispatchers.IO)
                .catch {
                    Log.d(TAG, "Failed to load from network")
                    Log.d(TAG, it.message ?: "no error message")
                    Log.d(TAG, "Loading from local data")
                    local.getRepositories()
                        .flowOn(Dispatchers.IO)
                        .catch {
                            Log.d(TAG, "Failed to load from local")
                            emit(listOf())
                        }
                        .collect { items ->
                            emit(items)
                        }
                }
                .collect {
                    if (it?.items != null) {
                        local.insertAllRepositories(it.items)
                            .flowOn(Dispatchers.IO)
                            .catch { throwable ->
                                Log.d(TAG, "Failed to insert into local emitting old data")
                                Log.d(TAG, throwable.message ?: "")
                                local.getRepositories()
                                    .flowOn(Dispatchers.IO)
                                    .catch {
                                        Log.d(TAG, "Failed to load from local")
                                        emit(listOf())
                                    }
                                    .collect { items ->
                                        emit(items)
                                    }
                            }
                            .collect {
                                Log.d(TAG, "Inserted into db")
                                local.getRepositories()
                                    .flowOn(Dispatchers.IO)
                                    .catch {
                                        Log.d(TAG, "Failed to load from local")
                                        emit(listOf())
                                    }
                                    .collect { items ->
                                        emit(items)
                                    }
                            }
                    }else{
                        Log.d(TAG, "Failed to load from network")
                        Log.d(TAG, "Loading from local data")
                        local.getRepositories()
                            .flowOn(Dispatchers.IO)
                            .catch {
                                Log.d(TAG, "Failed to load from local")
                                emit(listOf())
                            }
                            .collect { items ->
                                emit(items)
                            }
                    }
                }
        }
    }
}