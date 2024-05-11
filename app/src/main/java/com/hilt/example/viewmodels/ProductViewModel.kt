package com.hilt.example.viewmodels

import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hilt.example.api.Product
import com.hilt.example.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(private val productRepository: ProductRepository) : ViewModel() {

    init {

        viewModelScope.launch {
            getProduct()
        }
    }

    private suspend fun getProduct() {
       val data = productRepository.getProductRepo()
        Log.e("product", data.status)
        Log.e("product", data.totalResults.toString())
    }

}