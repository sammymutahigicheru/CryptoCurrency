package com.sammy.cryptocurrency.app

import android.app.Activity
import android.app.Application
import com.sammy.cryptocurrency.di.components.DaggerAppComponent
import com.sammy.cryptocurrency.di.modules.AppModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


/*
* As a hint when injecting all dependencies,
* the app’s application class must implement Dagger2’s “HasActivityInjector” interface
* and create the activity injector (DispatchingAndroidInjector<Activity>) which will be provided when activityInjector method is overridden.
*  It only needs to be done one time
* */

class CryptocurrencyApplication:Application(),HasActivityInjector {
    @Inject lateinit var activityInjector:DispatchingAndroidInjector<Activity>
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().appModule(AppModule(this)).build().inject(this)

    }
    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}
