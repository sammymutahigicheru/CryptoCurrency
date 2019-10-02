package com.sammy.cryptocurrency.di.modules

import com.sammy.cryptocurrency.CryptocurrenciesActivity
import dagger.Module

/*
*Adds concrete class to dependency graph
*Simply says where to apply the injection
* */
@Module
abstract class BuildersModule {
    abstract fun contributeCryptocurrenciesActivity():CryptocurrenciesActivity
}