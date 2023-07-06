package com.aliakberaakash.android_grpc.features.list.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aliakberaakash.android_grpc.features.list.domain.entity.GithubRepoUiEntity
import com.aliakberaakash.android_grpc.features.list.domain.usecase.GetGithubRepoUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class ListViewModel(private val useCase: GetGithubRepoUseCase) : ViewModel() {

    private val _result = MutableStateFlow<List<GithubRepoUiEntity>>(listOf())
    val result: StateFlow<List<GithubRepoUiEntity>> = _result

    init {
        getGithubRepo()
    }

    private fun getGithubRepo() = viewModelScope.launch(Dispatchers.IO) {
        useCase.getGithubRepo().flowOn(Dispatchers.IO)
            .catch {
                // todo: add error showing mechanism
                _result.value = listOf()
            }
            .collect {
                _result.value = it
            }
    }
}