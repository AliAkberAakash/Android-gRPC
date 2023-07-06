package com.aliakberaakash.android_grpc.common.data.entity

data class GithubRepoResponseEntity (
    val totalCount: Long? = null,
    val incompleteResults: Boolean? = null,
    val items: List<GithubRepoEntity>? = null
)