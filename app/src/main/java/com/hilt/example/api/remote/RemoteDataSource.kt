package com.hilt.example.api.remote

import com.hilt.example.api.Product
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val apiService: ApiService) {

    suspend fun getProduct(): Product {
        return apiService.getProducts()
    }
}