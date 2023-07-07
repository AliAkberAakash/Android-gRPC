package com.aliakberaakash.android_grpc.features.githubRepoList.di


import com.aliakberaakash.android_grpc.common.data.local.AppDatabase
import com.aliakberaakash.android_grpc.common.data.local.RoomBuilder
import com.aliakberaakash.android_grpc.common.data.network.RetrofitBuilder
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.local.GithubRepoListLocalDataSource
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.local.GithubRepoListLocalDataSourceImpl
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.remote.GithubRepoListRemoteDataSource
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.remote.GithubRepoListRemoteDataSourceImpl
import com.aliakberaakash.android_grpc.features.githubRepoList.data.repository.GithubRepoListRepository
import com.aliakberaakash.android_grpc.features.githubRepoList.data.repository.GithubRepoListRepositoryImpl
import com.aliakberaakash.android_grpc.features.githubRepoList.data.service.GithubRepoService
import com.aliakberaakash.android_grpc.features.githubRepoList.domain.usecase.GetGithubRepoUseCase
import com.aliakberaakash.android_grpc.features.githubRepoList.domain.usecase.GetGithubRepoUseCaseImpl
import com.aliakberaakash.android_grpc.features.githubRepoList.presentation.viewmodel.ListViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val githubRepoListModule = module {
    single<GithubRepoService> { RetrofitBuilder.getRetrofit().create(GithubRepoService::class.java) }
    single<AppDatabase> { RoomBuilder.getInstance(androidContext())}
    single<GithubRepoListRemoteDataSource> { GithubRepoListRemoteDataSourceImpl(get()) }
    single<GithubRepoListLocalDataSource> { GithubRepoListLocalDataSourceImpl(get()) }
    single<GithubRepoListRepository> { GithubRepoListRepositoryImpl(get(), get()) }
    single<GetGithubRepoUseCase> { GetGithubRepoUseCaseImpl(get()) }
    viewModel { ListViewModel(get()) }
}