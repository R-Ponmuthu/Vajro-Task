package com.vajro.task.beans

data class Product(
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val totalCount: Int,
    val totalPages: Int
)