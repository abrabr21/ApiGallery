package com.example.apigallery.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




data class PeopleResponse (
    @SerializedName("status")
    @Expose
     val status: String? = null
)
