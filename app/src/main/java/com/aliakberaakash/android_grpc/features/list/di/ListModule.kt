package com.aliakberaakash.android_grpc.features.list.di


import com.aliakberaakash.android_grpc.common.data.network.RetrofitBuilder
import com.aliakberaakash.android_grpc.features.list.data.datasource.ListRemoteDataSource
import com.aliakberaakash.android_grpc.features.list.data.datasource.ListRemoteDataSourceImpl
import com.aliakberaakash.android_grpc.features.list.data.repository.ListRepository
import com.aliakberaakash.android_grpc.features.list.data.repository.ListRepositoryImpl
import com.aliakberaakash.android_grpc.features.list.data.service.GithubRepoService
import com.aliakberaakash.android_grpc.features.list.domain.usecase.GetGithubRepoUseCase
import com.aliakberaakash.android_grpc.features.list.domain.usecase.GetGithubRepoUseCaseImpl
import com.aliakberaakash.android_grpc.features.list.presentation.viewmodel.ListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val listModule = module {
    single<GithubRepoService> { RetrofitBuilder.getRetrofit().create(GithubRepoService::class.java) }
    single<ListRemoteDataSource> { ListRemoteDataSourceImpl(get()) }
    single<ListRepository> { ListRepositoryImpl(get()) }
    single<GetGithubRepoUseCase> { GetGithubRepoUseCaseImpl(get()) }
    viewModel { ListViewModel(get()) }
}