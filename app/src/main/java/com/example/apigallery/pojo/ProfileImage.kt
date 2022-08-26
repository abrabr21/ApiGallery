package com.example.apigallery.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class ProfileImage (
    @SerializedName("small")
    @Expose
     val small: String? = null,

    @SerializedName("medium")
    @Expose
     val medium: String? = null,

    @SerializedName("large")
    @Expose
     val large: String? = null
    )