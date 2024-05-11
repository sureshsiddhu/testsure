package com.hilt.example.repository

import com.hilt.example.api.Product
import com.hilt.example.api.remote.RemoteDataSource
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class ProductRepository @Inject constructor(private val remoteDataSource: RemoteDataSource) {

    suspend fun getProductRepo(): Product {

        return remoteDataSource.getProduct()
    }


}