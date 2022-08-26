package com.example.apigallery.retrofit

import retrofit2.Call
import com.example.apigallery.pojo.EntityResponse
import retrofit2.http.GET

interface RetrofitService {
    @GET("photos")
    fun getEntityList ():Call<List<EntityResponse>>

}