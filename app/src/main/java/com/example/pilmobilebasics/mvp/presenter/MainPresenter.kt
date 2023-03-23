package com.example.pilmobilebasics.mvp.presenter

import com.example.pilmobilebasics.mvp.contract.MainContract

class MainPresenter(private val model: MainContract.Model, private val view: MainContract.View) : MainContract.Presenter {

    init {
        view.onAddButtonPressed { onAddButtonPressed() }
        view.onDecreaseButtonPressed { onDecreaseButtonPressed() }
        view.onResetButtonPressed { onResetButtonPressed() }
    }

    override fun onAddButtonPressed() {

    }

    override fun onDecreaseButtonPressed(){

    }

    override fun onResetButtonPressed(){

    }
}
