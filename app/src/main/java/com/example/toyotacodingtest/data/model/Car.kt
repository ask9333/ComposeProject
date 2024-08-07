package com.example.toyotacodingtest.data.model

import java.io.Serializable

data class Car(
    val id: Int,
    val title: String,
    val type: String,
    val year: Int,
    val description: String,
    val carImageId: Int = 0,
    val rating:Int
) : Serializable
