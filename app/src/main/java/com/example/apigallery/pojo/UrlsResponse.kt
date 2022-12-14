package com.example.apigallery.pojo

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class UrlsResponse (
    @SerializedName("raw")
    @Expose
     val raw: String? = null,

    @SerializedName("full")
    @Expose
     val full: String? = null,

    @SerializedName("regular")
    @Expose
     val regular: String? = null,

    @SerializedName("small")
    @Expose
     val small: String? = null,

    @SerializedName("thumb")
    @Expose
     val thumb: String? = null,

    @SerializedName("small_s3")
    @Expose
     val smallS3: String? = null
    )