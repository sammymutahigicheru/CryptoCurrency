package com.sammy.cryptocurrency.di.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(var app:Application) {
    @Provides
    @Singleton
    fun provideApplication(): Application = app
}