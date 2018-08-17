package com.example.framgianguyenhotiendat.pagingnetwork.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class AppModule {

    @Singleton
    @Provides
    fun provideContext(context: Application): Context = context
}