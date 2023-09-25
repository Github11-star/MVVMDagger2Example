package com.firozpocyt.mvvmdagger2example.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.firozpocyt.mvvmdagger2example.models.ProductItem
import com.firozpocyt.mvvmdagger2example.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val productRepository: ProductRepository) : ViewModel() {

    val productLiveData : LiveData<List<ProductItem>>
        get() = productRepository.products

    init {
        viewModelScope.launch {
            productRepository.getProducts()
        }
    }
}