package com.aliakberaakash.android_grpc.common.data.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import retrofit2.http.Field

@Entity(tableName = "githubrepoentity")
data class GithubRepoEntity (
    @PrimaryKey val id: Long,
    val nodeID: String? = null,
    val name: String? = null,
    val fullName: String? = null,
    @ColumnInfo(name = "isPrivate")
    @SerializedName("private")
    val isPrivate: Boolean? = null,
    @Embedded
    val owner: RepoOwnerEntity? = null,
    val htmlURL: String? = null,
    val description: String? = null,
    val fork: Boolean? = null,
    val url: String? = null,
    val forksURL: String? = null,
    val keysURL: String? = null,
    val collaboratorsURL: String? = null,
    val teamsURL: String? = null,
    val hooksURL: String? = null,
    val issueEventsURL: String? = null,
    val eventsURL: String? = null,
    val assigneesURL: String? = null,
    val branchesURL: String? = null,
    val tagsURL: String? = null,
    val blobsURL: String? = null,
    val gitTagsURL: String? = null,
    val gitRefsURL: String? = null,
    val treesURL: String? = null,
    val statusesURL: String? = null,
    val languagesURL: String? = null,
    val stargazersURL: String? = null,
    val contributorsURL: String? = null,
    val subscribersURL: String? = null,
    val subscriptionURL: String? = null,
    val commitsURL: String? = null,
    val gitCommitsURL: String? = null,
    val commentsURL: String? = null,
    val issueCommentURL: String? = null,
    val contentsURL: String? = null,
    val compareURL: String? = null,
    val mergesURL: String? = null,
    val archiveURL: String? = null,
    val downloadsURL: String? = null,
    val issuesURL: String? = null,
    val pullsURL: String? = null,
    val milestonesURL: String? = null,
    val notificationsURL: String? = null,
    val labelsURL: String? = null,
    val releasesURL: String? = null,
    val deploymentsURL: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val pushedAt: String? = null,
    val gitURL: String? = null,
    val sshURL: String? = null,
    val cloneURL: String? = null,
    val svnURL: String? = null,
    val homepage: String? = null,
    val size: Long? = null,
    val stargazersCount: Long? = null,
    val watchersCount: Long? = null,
    val language: String? = null,
    val hasIssues: Boolean? = null,
    val hasProjects: Boolean? = null,
    val hasDownloads: Boolean? = null,
    val hasWiki: Boolean? = null,
    val hasPages: Boolean? = null,
    val forksCount: Long? = null,
    val mirrorURL: String? = null,
    val archived: Boolean? = null,
    val disabled: Boolean? = null,
    val openIssuesCount: Long? = null,
    //val license: String? = null,
    val allowForking: Boolean? = null,
    val isTemplate: Boolean? = null,
    val webCommitSignoffRequired: Boolean? = null,
    //val topics: List<String>? = null,
    val visibility: String? = null,
    val forks: Long? = null,
    val openIssues: Long? = null,
    val watchers: Long? = null,
    val defaultBranch: String? = null,
    val score: Long? = null
)