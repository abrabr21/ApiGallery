package com.example.apigallery.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class SocialResponse (
    @SerializedName("instagram_username")
    @Expose
     val instagramUsername: String? = null,

    @SerializedName("portfolio_url")
    @Expose
     val portfolioUrl: String? = null,

    @SerializedName("twitter_username")
    @Expose
     val twitterUsername: String? = null,

    @SerializedName("paypal_email")
    @Expose
     val paypalEmail: Any? = null
    )