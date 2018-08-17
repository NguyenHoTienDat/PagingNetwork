package com.example.framgianguyenhotiendat.pagingnetwork.ui

import android.arch.lifecycle.*
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import com.example.framgianguyenhotiendat.pagingnetwork.data.model.Article
import com.example.framgianguyenhotiendat.pagingnetwork.data.source.remote.pagesource.FeedRemotePagedFactory

class MainViewModel : ViewModel(), LifecycleObserver {

    val articles = MutableLiveData<PagedList<Article>>()

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startViewModel() {


    }
}