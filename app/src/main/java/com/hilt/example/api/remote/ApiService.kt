package com.hilt.example.api.remote

import com.hilt.example.api.Product
import retrofit2.http.GET

interface ApiService {

    @GET("v2/everything?q=tesla&from=2024-04-11&sortBy=publishedAt&apiKey=0cf41fc677d84407aa407d07dbbeca32")
    suspend fun getProducts() : Product
}