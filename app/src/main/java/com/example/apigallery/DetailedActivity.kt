package com.example.apigallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class DetailedActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datailed)
        val entityResponse = intent.getSerializableExtra("photo")
        if(entityResponse!=null){
            val imageView : ImageView = findViewById(R.id.photo)
            Picasso.get().load(entityResponse.toString()).into(imageView)
        }
    }
}