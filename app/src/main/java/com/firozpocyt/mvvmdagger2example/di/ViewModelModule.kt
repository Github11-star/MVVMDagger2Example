package com.firozpocyt.mvvmdagger2example.di

import androidx.lifecycle.ViewModel
import com.firozpocyt.mvvmdagger2example.viewModels.MainViewModel
import com.firozpocyt.mvvmdagger2example.viewModels.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey


@InstallIn(SingletonComponent::class)
@Module
abstract class ViewModelModule {

    @Binds
    @ClassKey(MainViewModel::class)
    @IntoMap
    abstract fun mainViewModel(mainViewModel: MainViewModel) : ViewModel

    @Binds
    @ClassKey(MainViewModel2::class)
    @IntoMap
    abstract fun mainViewModel2(mainViewModel2: MainViewModel2) : ViewModel
}