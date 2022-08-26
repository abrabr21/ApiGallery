package com.example.apigallery.pojo

import com.google.gson.annotations.SerializedName

class SponsorshipResponse (
    @SerializedName("impression_urls")
    val impressionUrls : Any?= null,
    @SerializedName("tagline")
    val tagline : String?= null,
    @SerializedName("tagline_url")
    val tagline_url : String?= null

)