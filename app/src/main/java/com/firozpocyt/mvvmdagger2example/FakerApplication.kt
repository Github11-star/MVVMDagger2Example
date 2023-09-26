package com.firozpocyt.mvvmdagger2example

import android.app.Application
import com.firozpocyt.mvvmdagger2example.di.ApplicationComponent
import com.firozpocyt.mvvmdagger2example.di.DaggerApplicationComponent

class FakerApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)

    }
}