package com.example.apigallery.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class EntityResponse (
    @SerializedName("id")
    @Expose val id: String? = null,

    @SerializedName("created_at")
    @Expose
     val createdAt: String? = null,

    @SerializedName("updated_at")
    @Expose
     val updatedAt: String? = null,

    @SerializedName("promoted_at")
    @Expose
     val promotedAt: String? = null,

    @SerializedName("width")
    @Expose
     val width: Int? = null,

    @SerializedName("height")
    @Expose
     val height: Int? = null,

    @SerializedName("color")
    @Expose
     val color: String? = null,

    @SerializedName("blur_hash")
    @Expose
     val blurHash: String? = null,

    @SerializedName("description")
    @Expose
     val description: Any? = null,

    @SerializedName("alt_description")
    @Expose
     val altDescription: Any? = null,

    @SerializedName("urls")
    @Expose
     val urls: UrlsResponse? = null,

    @SerializedName("links")
    @Expose
     val links: LinksResponse? = null,

    @SerializedName("categories")
    @Expose
     val categories: List<Any>? = null,

    @SerializedName("likes")
    @Expose
     val likes: Int? = null,

    @SerializedName("liked_by_user")
    @Expose
     val likedByUser: Boolean? = null,

    @SerializedName("current_user_collections")
    @Expose
     val currentUserCollections: List<Any>? = null,

    @SerializedName("sponsorship")
    @Expose
     val sponsorship: SponsorshipResponse? = null,

    @SerializedName("topic_submissions")
    @Expose
     val topicSubmissions: TopicSubmissionsResponse? = null,

    @SerializedName("user")
    @Expose
     val user: UserResponse? = null
)