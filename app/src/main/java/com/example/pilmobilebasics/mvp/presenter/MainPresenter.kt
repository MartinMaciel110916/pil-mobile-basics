package com.example.pilmobilebasics.mvp.presenter

import com.example.pilmobilebasics.mvp.contract.MainContract

class MainPresenter(private val model: MainContract.Model, private val view: MainContract.View) : MainContract.Presenter {

    init {
        view.onAddButtonPressed { onAddButtonPressed() }
        view.onDecreaseButtonPressed { onDecreaseButtonPressed() }
        view.onResetButtonPressed { onResetButtonPressed() }
    }

    override fun onAddButtonPressed() {
        model.addToCounter(view.editCounter().toString())
        view.setCounter(model.getCounter())
    }

    override fun onDecreaseButtonPressed() {
        model.subtractFromCounter(view.editCounter().toString())
        view.setCounter(model.getCounter())
    }

    override fun onResetButtonPressed() {
        model.reset()
        view.setCounter(model.getCounter())
    }
}
