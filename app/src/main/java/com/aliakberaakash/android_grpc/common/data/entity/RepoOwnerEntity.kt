package com.aliakberaakash.android_grpc.common.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RepoOwnerEntity (
    @PrimaryKey
    @ColumnInfo(name = "ownerId")
    val id: Long,
    val login: String? = null,
    @ColumnInfo(name = "ownerNodeId")
    val nodeID: String? = null,
    val avatarURL: String? = null,
    val gravatarID: String? = null,
    @ColumnInfo(name = "ownerUrl")
    val url: String? = null,
    @ColumnInfo(name = "ownerHtmlUrl")
    val htmlURL: String? = null,
    val followersURL: String? = null,
    val followingURL: String? = null,
    val gistsURL: String? = null,
    val starredURL: String? = null,
    val subscriptionsURL: String? = null,
    val organizationsURL: String? = null,
    val reposURL: String? = null,
    @ColumnInfo(name = "ownerEventsUrl")
    val eventsURL: String? = null,
    val receivedEventsURL: String? = null,
    val type: String? = null,
    val siteAdmin: Boolean? = null
)