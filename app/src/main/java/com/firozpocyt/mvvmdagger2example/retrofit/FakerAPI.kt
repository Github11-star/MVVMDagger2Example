package com.firozpocyt.mvvmdagger2example.retrofit

import com.firozpocyt.mvvmdagger2example.models.ProductItem
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
    suspend fun getProducts() : Response<List<ProductItem>>
}