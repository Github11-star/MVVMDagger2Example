package com.firozpocyt.mvvmdagger2example.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.firozpocyt.mvvmdagger2example.repository.ProductRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val productRepository: ProductRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(productRepository) as T
    }
}