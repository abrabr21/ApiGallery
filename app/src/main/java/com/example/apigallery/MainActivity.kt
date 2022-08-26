package com.example.apigallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apigallery.adapter.EntityAdapter
import com.example.apigallery.common.Common
import com.example.apigallery.databinding.ActivityMainBinding
import com.example.apigallery.pojo.EntityResponse
import com.example.apigallery.retrofit.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mService: RetrofitService by lazy { Common.retrofitService }


    private val adapter by lazy { EntityAdapter(arrayListOf()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUi()

        getAllArticleList()

    }

    private fun getAllArticleList() {

        mService.getEntityList().enqueue(object : Callback<List<EntityResponse>> {
            override fun onFailure(call: Call<List<EntityResponse>>, t: Throwable) {
                println("FAIL  " + t.message)
                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(
                call: Call<List<EntityResponse>>,
                response: Response<List<EntityResponse>>,
            ) {
                adapter.updateList(response.body() as List<EntityResponse>)
                adapter.onItemClick={
                    val intent= Intent(this@MainActivity,DetailedActivity::class.java)
                    intent.putExtra("photo",it.urls?.full)
                    startActivity(intent)
                }
            }
        })

    }

    private fun initUi() {
        with(binding.recyclerPhotoList) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = this@MainActivity.adapter


        }
    }
}