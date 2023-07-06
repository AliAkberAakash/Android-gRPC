package com.aliakberaakash.android_grpc.features.githubRepoList.domain.entity

import com.aliakberaakash.android_grpc.common.data.entity.GithubRepoResponseEntity

class GithubRepoUiEntityMapper {
    companion object {
        fun map(response : GithubRepoResponseEntity?) : List<GithubRepoUiEntity> {
            
            if(response?.items == null)
                return listOf()
            
            return response.items.map { 
                GithubRepoUiEntity(
                    id = it.id,
                    name = it.name,
                    owner = it.owner,
                )
            }
        } 
    }
}