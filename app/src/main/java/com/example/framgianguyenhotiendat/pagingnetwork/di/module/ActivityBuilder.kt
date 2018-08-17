package com.example.framgianguyenhotiendat.pagingnetwork.di.module

import com.example.framgianguyenhotiendat.pagingnetwork.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}