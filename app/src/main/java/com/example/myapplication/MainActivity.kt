package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.products.ProductResponseModel
import com.example.myapplication.products.ProductResponseModelItem
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MyAdapter
    private var mDataclsitem = ArrayList<Data_cls_item>()


    private lateinit var adapterb: MineAdapter
    private var mData_products = ArrayList<ProductResponseModelItem>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.carousel.registerLifecycle(lifecycle)

       var carousel = mutableListOf<CarouselItem>()

        carousel.add(CarouselItem(imageUrl = "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg","offer sale"))
        carousel.add(CarouselItem(imageUrl = "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg","offer sale"))
        carousel.add(CarouselItem(imageUrl = "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg","offer sale"))

        binding.carousel.setData(carousel)
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )
        mDataclsitem.add(
            Data_cls_item(
                "https://i.pinimg.com/550x/90/c9/d3/90c9d327f794b9e6be7c1dfc1aec8fa7.jpg",
                "abc"
            )
        )

        adapter = MyAdapter(this, mDataclsitem)

        binding.categoriesList.layoutManager =
            GridLayoutManager(this, 2, LinearLayoutManager.HORIZONTAL, false)
        binding.categoriesList.adapter = adapter

        Retrofit().getClient().create(ApiInterface::class.java).getproducts().enqueue(object : Callback<ProductResponseModel>{
            override fun onResponse(
                call: Call<ProductResponseModel>,
                response: Response<ProductResponseModel>
            ) {

               mData_products.addAll(response.body()?.productResponseModel as ArrayList<ProductResponseModelItem>)

                adapterb.notifyDataSetChanged()
            }


            override fun onFailure(call: Call<ProductResponseModel>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

        //for 2nd rcview


        adapterb = MineAdapter(this, mData_products)
        binding.productDetails.layoutManager = GridLayoutManager(this, 2)
        binding.productDetails.adapter = adapterb

    }
}



