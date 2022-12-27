package com.yasinsenel.depremtakibi

data class ResultData(
    val coordinates: List<Double>,
    val date: String,
    val date_stamp: String,
    val depth: Double,
    val hash: String,
    val hash2: String,
    val lat: Double,
    val lng: Double,
    val lokasyon: String,
    val mag: Double,
    val rev: Any,
    val timestamp: Int,
    val title: String
)