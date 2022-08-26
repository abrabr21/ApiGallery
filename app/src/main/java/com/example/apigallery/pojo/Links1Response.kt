package com.example.apigallery.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class Links1Response (
    @SerializedName("self")
    @Expose
     val self: String? = null,

    @SerializedName("html")
    @Expose
     val html: String? = null,

    @SerializedName("photos")
    @Expose
     val photos: String? = null,

    @SerializedName("likes")
    @Expose
     val likes: String? = null,

    @SerializedName("portfolio")
    @Expose
     val portfolio: String? = null,

    @SerializedName("following")
    @Expose
     val following: String? = null,

    @SerializedName("followers")
    @Expose
     val followers: String? = null
    )