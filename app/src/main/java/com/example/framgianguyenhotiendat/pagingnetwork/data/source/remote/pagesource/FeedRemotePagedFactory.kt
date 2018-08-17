package com.example.framgianguyenhotiendat.pagingnetwork.data.source.remote.pagesource

import android.arch.paging.DataSource
import com.example.framgianguyenhotiendat.pagingnetwork.data.model.Article
import com.example.framgianguyenhotiendat.pagingnetwork.data.source.remote.api.FeedApi

/**
 * Factory receive data by using DataSource ( is FeedRemotePagedSource )
 * and PagedList config we imp in activity
 */
class FeedRemotePagedFactory constructor(var api: FeedApi)
    : DataSource.Factory<Long, Article>() {

    override fun create(): DataSource<Long, Article> = FeedRemotePagedSource(feedApi = api)
}