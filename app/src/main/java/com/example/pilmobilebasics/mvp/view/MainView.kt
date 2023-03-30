package com.example.pilmobilebasics.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.pilmobilebasics.databinding.ActivityMainBinding
import com.example.pilmobilebasics.mvp.contract.MainContract
import com.example.pilmobilebasics.mvp.view.base.ActivityView
import com.example.pilmobilebasics.util.Constants.ERROR_BUTTON_MSG

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun editCounter(): String {
        return binding.counterInput.text.toString()
    }

    override fun whatIfUserDoesNotInsertNumber() {
        Toast.makeText(activity, ERROR_BUTTON_MSG, Toast.LENGTH_SHORT).show()
    }

    override fun setCounter(counter: String) {
        binding.counterTxt.text = counter
    }

    override fun onAddButtonPressed(onClick: () -> Unit) {
        binding.btnAdd.setOnClickListener { onClick() }
    }

    override fun onDecreaseButtonPressed(onClick: () -> Unit) {
        binding.btnDecrease.setOnClickListener { onClick() }
    }

    override fun onResetButtonPressed(onClick: () -> Unit) {
        binding.btnReset.setOnClickListener { onClick() }
    }
}
