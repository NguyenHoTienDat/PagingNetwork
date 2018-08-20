package com.example.framgianguyenhotiendat.pagingnetwork.ui.roomload

import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.ViewModel
import com.example.framgianguyenhotiendat.pagingnetwork.data.repository.DataSource
import javax.inject.Inject

class RoomLoadViewModel @Inject constructor(
        private val repo: DataSource
) : ViewModel(), LifecycleObserver {
}