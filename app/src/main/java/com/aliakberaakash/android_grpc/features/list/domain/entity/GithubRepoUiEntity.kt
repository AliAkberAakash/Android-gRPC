package com.aliakberaakash.android_grpc.features.list.domain.entity

import com.aliakberaakash.android_grpc.common.data.entity.RepoOwnerEntity

data class GithubRepoUiEntity(
    val id: Long? = null,
    val name: String? = null,
    val owner: RepoOwnerEntity? = null,
)