package com.example.myapplication.products

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductResponseModel(

	@field:SerializedName("ProductResponseModel")
	val productResponseModel: List<ProductResponseModelItem?>? = null
) : Parcelable

@Parcelize
data class ProductResponseModelItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("price")
	val price: Double? = null,

	@field:SerializedName("rating")
	val rating: Rating? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("category")
	val category: String? = null
) : Parcelable

@Parcelize
data class Rating(

	@field:SerializedName("rate")
	val rate: Double? = null,

	@field:SerializedName("count")
	val count: Int? = null
) : Parcelable
