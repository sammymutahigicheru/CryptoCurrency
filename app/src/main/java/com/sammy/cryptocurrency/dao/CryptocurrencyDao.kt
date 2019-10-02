package com.sammy.cryptocurrency.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sammy.cryptocurrency.model.CryptoCurrency


@Dao
interface CryptocurrencyDao {

    @Query("SELECT * FROM cryptocurrency")
    fun queryCryptocurrencies(): LiveData<List<CryptoCurrency>>

    @Insert(
        onConflict = OnConflictStrategy.REPLACE
    )
    fun insertCryptocurrency(cryptocurrency: CryptoCurrency)
}