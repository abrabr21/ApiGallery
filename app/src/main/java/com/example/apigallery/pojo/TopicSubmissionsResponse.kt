package com.example.apigallery.pojo

import com.example.apigallery.pojo.PeopleResponse

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class TopicSubmissionsResponse (
    @SerializedName("people")
    @Expose
     val people: PeopleResponse? = null
    )