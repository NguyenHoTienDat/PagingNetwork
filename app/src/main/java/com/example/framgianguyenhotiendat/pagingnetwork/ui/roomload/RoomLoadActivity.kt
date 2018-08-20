package com.example.framgianguyenhotiendat.pagingnetwork.ui.roomload

import android.arch.lifecycle.LifecycleOwner
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.framgianguyenhotiendat.pagingnetwork.R
import com.example.framgianguyenhotiendat.pagingnetwork.ui.ViewModelProviderFactory
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_room_load.*
import javax.inject.Inject

class RoomLoadActivity : AppCompatActivity(), LifecycleOwner {

    @Inject
    lateinit var viewModelFactory: ViewModelProviderFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_load)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recycler_note.addOnScrollListener(object: RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                fb_add_note
            }
        })
    }

    companion object {
        fun getRoomLoadActIntent(context: Context) = Intent(context, RoomLoadActivity::class.java)
    }
}
