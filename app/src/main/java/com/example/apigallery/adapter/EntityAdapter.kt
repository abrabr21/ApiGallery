package com.example.apigallery.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apigallery.R
import com.example.apigallery.pojo.EntityResponse
import com.squareup.picasso.Picasso

class EntityAdapter(private var entityList: List<EntityResponse>):
    RecyclerView.Adapter<EntityAdapter.ViewHolder>() {

    var onItemClick: ((EntityResponse)->Unit)?=null

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.image_movie)
        val txt_name: TextView = itemView.findViewById(R.id.txt_name)
        val txt_team: TextView = itemView.findViewById(R.id.txt_team)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() =  entityList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = entityList[position]
        Picasso.get().load(listItem.urls?.regular).into(holder.image)
        holder.txt_name.text = listItem.sponsorship?.tagline
        holder.txt_team.text ="Author: ${listItem.user?.name}"

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(listItem)
        }
    }

    fun updateList(newEntityList: List<EntityResponse>){
        entityList = newEntityList
        notifyDataSetChanged()
    }

}
