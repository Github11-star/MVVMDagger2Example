package com.firozpocyt.mvvmdagger2example.di

import com.firozpocyt.mvvmdagger2example.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}