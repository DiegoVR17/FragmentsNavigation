package com.example.ejemplofragments.model

import java.io.Serializable

data class Superheroe(
    val id: Int,
    val name: String,
    val alias: String,
    val image: Int,
    val powers: String
) : Serializable
