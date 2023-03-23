package com.example.pilmobilebasics.mvp.view

import android.app.Activity
import com.example.pilmobilebasics.databinding.ActivityMainBinding
import com.example.pilmobilebasics.mvp.contract.MainContract
import com.example.pilmobilebasics.mvp.view.base.ActivityView

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun setCounter(counter: String) {
    }

    override fun onAddButtonPressed(onClick: () -> Unit) {
    }

    override fun onDecreaseButtonPressed(onClick: () -> Unit) {
    }

    override fun onResetButtonPressed(onClick: () -> Unit) {
    }
}
