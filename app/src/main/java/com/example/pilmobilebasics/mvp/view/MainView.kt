package com.example.pilmobilebasics.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.pilmobilebasics.databinding.ActivityMainBinding
import com.example.pilmobilebasics.mvp.contract.MainContract
import com.example.pilmobilebasics.mvp.view.base.ActivityView
import com.example.pilmobilebasics.util.Constants.ERROR_BUTTON

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    private lateinit var editCounter: String

    init {
        activity.setContentView(binding.root)
    }

    override fun editCounter(): String {
        editCounter = binding.counterInput.text.toString()
        return editCounter
    }

    override fun whatIfUserDoesNotInsertNumber() {
        Toast.makeText(activity, ERROR_BUTTON, Toast.LENGTH_SHORT).show()
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
