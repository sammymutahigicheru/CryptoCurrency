package com.sammy.cryptocurrency.di.modules

import android.app.Application
import androidx.room.Room
import com.sammy.cryptocurrency.dao.CryptocurrencyDao
import com.sammy.cryptocurrency.dao.Database
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(var app: Application) {
    @Provides
    @Singleton
    fun provideApplication(): Application = app

    @Provides
    @Singleton
    fun provideCryptocurrenciesDatabase(app: Application): Database = Room.databaseBuilder(
        app,
        Database::class.java, "cryptocurrencies_db"
    ).build()

    @Provides
    @Singleton
    fun provideCryptocurrenciesDao(database: Database): CryptocurrencyDao =
        database.cryptocurrenciesDao()

}