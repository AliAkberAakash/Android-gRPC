package com.aliakberaakash.android_grpc.features.githubRepoList.di


import com.aliakberaakash.android_grpc.common.data.network.RetrofitBuilder
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.GithubRepoListRemoteDataSource
import com.aliakberaakash.android_grpc.features.githubRepoList.data.datasource.GithubRepoListRemoteDataSourceImpl
import com.aliakberaakash.android_grpc.features.githubRepoList.data.repository.GithubRepoListRepository
import com.aliakberaakash.android_grpc.features.githubRepoList.data.repository.GithubRepoListRepositoryImpl
import com.aliakberaakash.android_grpc.features.githubRepoList.data.service.GithubRepoService
import com.aliakberaakash.android_grpc.features.githubRepoList.domain.usecase.GetGithubRepoUseCase
import com.aliakberaakash.android_grpc.features.githubRepoList.domain.usecase.GetGithubRepoUseCaseImpl
import com.aliakberaakash.android_grpc.features.githubRepoList.presentation.viewmodel.ListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val githubRepoListModule = module {
    single<GithubRepoService> { RetrofitBuilder.getRetrofit().create(GithubRepoService::class.java) }
    single<GithubRepoListRemoteDataSource> { GithubRepoListRemoteDataSourceImpl(get()) }
    single<GithubRepoListRepository> { GithubRepoListRepositoryImpl(get()) }
    single<GetGithubRepoUseCase> { GetGithubRepoUseCaseImpl(get()) }
    viewModel { ListViewModel(get()) }
}