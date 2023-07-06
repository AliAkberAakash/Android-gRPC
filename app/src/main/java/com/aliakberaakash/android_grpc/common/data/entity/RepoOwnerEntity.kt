package com.aliakberaakash.android_grpc.common.data.entity

data class RepoOwnerEntity (
    val login: String? = null,
    val id: Long? = null,
    val nodeID: String? = null,
    val avatarURL: String? = null,
    val gravatarID: String? = null,
    val url: String? = null,
    val htmlURL: String? = null,
    val followersURL: String? = null,
    val followingURL: String? = null,
    val gistsURL: String? = null,
    val starredURL: String? = null,
    val subscriptionsURL: String? = null,
    val organizationsURL: String? = null,
    val reposURL: String? = null,
    val eventsURL: String? = null,
    val receivedEventsURL: String? = null,
    val type: String? = null,
    val siteAdmin: Boolean? = null
)