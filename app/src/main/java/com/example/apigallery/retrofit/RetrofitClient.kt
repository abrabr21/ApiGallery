package com.example.apigallery.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    object RetrofitClient {
        private var retrofit: Retrofit? = null
        fun requestInterceptor(): OkHttpClient {
            return OkHttpClient().newBuilder().addInterceptor {
                val original = it.request()
                val url = original.url().newBuilder().addQueryParameter("client_id","ab3411e4ac868c2646c0ed488dfd919ef612b04c264f3374c97fff98ed253dc9").build()
                val builder = original.newBuilder()
                    .method(original.method(), original.body()).url(url)



                it.proceed(builder.build())
            }.build()
        }
        fun getClient(baseUrl: String): Retrofit {
            if (retrofit == null) {

                retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(requestInterceptor())
                    .build()
            }
            return retrofit!!
        }
    }

}