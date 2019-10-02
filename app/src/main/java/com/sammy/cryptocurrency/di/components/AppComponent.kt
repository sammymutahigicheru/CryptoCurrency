package com.sammy.cryptocurrency.di.components

import android.app.Application
import com.sammy.cryptocurrency.di.modules.BuildersModule
import com.sammy.cryptocurrency.di.modules.AppModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton
/*
* indicates which modules am using
* */
@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, BuildersModule::class, AppModule::class))
interface AppComponent {
    fun inject(app:Application)
}