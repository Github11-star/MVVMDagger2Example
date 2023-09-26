package com.firozpocyt.mvvmdagger2example.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.firozpocyt.mvvmdagger2example.db.FakerDB
import com.firozpocyt.mvvmdagger2example.models.ProductItem
import com.firozpocyt.mvvmdagger2example.retrofit.FakerAPI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI, private val fakerDB: FakerDB) {

    private val _products = MutableLiveData<List<ProductItem>>()
    val products : LiveData<List<ProductItem>>
        get() = _products

    suspend fun getProducts(){
        val results = fakerAPI.getProducts()
        if (results.isSuccessful && results.body() != null){
            CoroutineScope(Dispatchers.IO).launch {
                fakerDB.getFakerDAO().addProducts(results.body()!!)
                _products.postValue(results.body())
            }

        }
    }
}