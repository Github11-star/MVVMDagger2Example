package com.firozpocyt.mvvmdagger2example.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.firozpocyt.mvvmdagger2example.models.ProductItem
import com.firozpocyt.mvvmdagger2example.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val productRepository: ProductRepository,
    private val randomize: Randomize) : ViewModel() {

    val productLiveData : LiveData<List<ProductItem>>
        get() = productRepository.products

    init {
        viewModelScope.launch {
            productRepository.getProducts()
        }
    }
}

class Randomize @Inject constructor(){
    fun doAction(){
        Log.d("FIROZPOC", "doAction: FIROZPOC")
    }
}