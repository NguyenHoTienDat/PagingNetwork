package com.example.framgianguyenhotiendat.pagingnetwork.ui

import android.arch.lifecycle.*
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.framgianguyenhotiendat.pagingnetwork.R
import com.example.framgianguyenhotiendat.pagingnetwork.data.model.Article
import com.example.framgianguyenhotiendat.pagingnetwork.data.source.remote.api.FeedApi
import com.example.framgianguyenhotiendat.pagingnetwork.data.source.remote.pagesource.FeedRemotePagedFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), LifecycleOwner {

    // inject api in order to test
    //in fact, we need create RemoteRepo, use dagger provide it and use in ViewModel to fetch data
    @Inject
    lateinit var api: FeedApi

    private lateinit var viewModel: MainViewModel

    private lateinit var articles : LiveData<PagedList<Article>>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()

    }

    private fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        lifecycle.addObserver(viewModel)

        //the config ( and the factory ), is used for Builder build PagedLiveData
        val pagedListConfig = PagedList.Config.Builder()
                .setEnablePlaceholders(false) //holder when item doesn't fully load
                .setInitialLoadSizeHint(5) //size of item list in the first load
                .setPageSize(20).build() //the number of item to be load

        articles = LivePagedListBuilder(FeedRemotePagedFactory(api), pagedListConfig).build()
        viewModel.articles.observe(this, Observer {
            Log.d("yyyy", " result : " + it.toString())
        })
    }
}
