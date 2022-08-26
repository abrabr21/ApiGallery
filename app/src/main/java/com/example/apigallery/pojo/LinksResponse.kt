package com.example.apigallery.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class LinksResponse (
    @SerializedName("self")
    @Expose
     val self: String? = null,

    @SerializedName("html")
    @Expose
     val html: String? = null,

    @SerializedName("download")
    @Expose
     val download: String? = null,

    @SerializedName("download_location")
    @Expose
     val downloadLocation: String? = null
)
