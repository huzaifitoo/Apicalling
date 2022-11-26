package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemCategoriesBinding
import com.squareup.picasso.Picasso

class MyAdapter(var context: Context , private val mDataclsitem : ArrayList<Data_cls_item>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(private val binding: ItemCategoriesBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(dataClsItem: Data_cls_item){
            binding.label.text = dataClsItem.Icon
            Picasso.get().load(dataClsItem.ImgUrl).into(binding.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemCategoriesBinding = ItemCategoriesBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(itemCategoriesBinding)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
     val dataClsItem = mDataclsitem[position]
        holder.bind(dataClsItem)
    }

    override fun getItemCount(): Int {
     return mDataclsitem.size
    }
}