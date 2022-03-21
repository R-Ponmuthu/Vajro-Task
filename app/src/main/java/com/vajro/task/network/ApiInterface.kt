package com.vajro.task.network

import com.vajro.task.beans.Product
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/5def7b172f000063008e0aa2")
    suspend fun getProducts(): Response<List<Product>>
}