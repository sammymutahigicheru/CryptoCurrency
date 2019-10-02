package com.sammy.cryptocurrency.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import java.io.Serializable

@Entity(
    tableName = "cryptocurrency"
)
data class Cryptocurrency(

    @Json(name = "id")
    @PrimaryKey
    val id: Int,

    @Json(name = "name")
    val name: String? = null,

    @Json(name = "symbol")
    val symbol: String = "",

    @Json(name = "rank")
    val rank: String? = null,

    @Json(name = "price_usd")
    val priceUsd: String = "",

    @Json(name = "price_btc")
    val priceBtc: String = "",

    @Json(name = "24h_volume_usd")
    val jsonMember24hVolumeUsd: String = "",

    @Json(name = "market_cap_usd")
    val marketCapUsd: String = "",

    @Json(name = "available_supply")
    val availableSupply: String = "",

    @Json(name = "total_supply")
    val totalSupply: String = "",

    @Json(name = "max_supply")
    val maxSupply: String = "",

    @Json(name = "percent_change_1h")
    val percentChange1h: String = "",

    @Json(name = "percent_change_24h")
    val percentChange24h: String = "",

    @Json(name = "percent_change_7d")
    val percentChange7d: String = "",

    @Json(name = "last_updated")
    val lastUpdated: Long = 0
) :Serializable