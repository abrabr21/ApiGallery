package com.example.apigallery.common

import com.example.apigallery.retrofit.RetrofitClient
import com.example.apigallery.retrofit.RetrofitService

object Common {
    val BASE_URL="https://api.unsplash.com/"
    val retrofitService : RetrofitService
        get()= RetrofitClient.RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}