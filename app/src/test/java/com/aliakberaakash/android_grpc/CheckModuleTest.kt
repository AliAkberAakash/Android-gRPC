package com.aliakberaakash.android_grpc

import com.aliakberaakash.android_grpc.features.githubRepoList.di.githubRepoListModule
import org.junit.Test
import org.koin.test.KoinTest
import org.koin.test.verify.verify

class CheckModulesTest : KoinTest {

    @Test
    fun checkAllModules() {
        githubRepoListModule.verify()
    }
}