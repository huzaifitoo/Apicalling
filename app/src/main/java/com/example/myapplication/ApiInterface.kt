package com.example.myapplication

import com.example.myapplication.products.ProductResponseModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    fun getproducts(): Call<ProductResponseModel>
}