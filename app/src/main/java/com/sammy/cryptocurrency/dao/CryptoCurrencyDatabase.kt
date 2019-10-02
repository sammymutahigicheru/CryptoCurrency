package com.sammy.cryptocurrency.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sammy.cryptocurrency.model.CryptoCurrency

@Database(entities = arrayOf(CryptoCurrency::class),version = 1)
abstract class Database : RoomDatabase() {
    abstract fun cryptocurrenciesDao(): CryptocurrencyDao
}