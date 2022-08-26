package com.example.apigallery.pojo

import com.example.apigallery.pojo.Links1Response
import com.example.apigallery.pojo.ProfileImage
import com.example.apigallery.pojo.SocialResponse
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class UserResponse (
    @SerializedName("id")
    @Expose
     val id: String? = null,

    @SerializedName("updated_at")
    @Expose
     val updatedAt: String? = null,

    @SerializedName("username")
    @Expose
     val username: String? = null,

    @SerializedName("name")
    @Expose
     val name: String? = null,

    @SerializedName("first_name")
    @Expose
     val firstName: String? = null,

    @SerializedName("last_name")
    @Expose
     val lastName: String? = null,

    @SerializedName("twitter_username")
    @Expose
     val twitterUsername: String? = null,

    @SerializedName("portfolio_url")
    @Expose
     val portfolioUrl: String? = null,

    @SerializedName("bio")
    @Expose
     val bio: String? = null,

    @SerializedName("location")
    @Expose
     val location: String? = null,

    @SerializedName("links")
    @Expose
     val links: Links1Response? = null,

    @SerializedName("profile_image")
    @Expose
     val profileImage: ProfileImage? = null,

    @SerializedName("instagram_username")
    @Expose
     val instagramUsername: String? = null,

    @SerializedName("total_collections")
    @Expose
     val totalCollections: Int? = null,

    @SerializedName("total_likes")
    @Expose
     val totalLikes: Int? = null,

    @SerializedName("total_photos")
    @Expose
     val totalPhotos: Int? = null,

    @SerializedName("accepted_tos")
    @Expose
     val acceptedTos: Boolean? = null,

    @SerializedName("for_hire")
    @Expose
     val forHire: Boolean? = null,

    @SerializedName("social")
    @Expose
     val social: SocialResponse? = null
)