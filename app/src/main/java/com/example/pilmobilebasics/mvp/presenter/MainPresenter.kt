package com.example.pilmobilebasics.mvp.presenter

import com.example.pilmobilebasics.mvp.contract.MainContract
import com.example.pilmobilebasics.util.Constants.NULL_VALUE

class MainPresenter(private val model: MainContract.Model, private val view: MainContract.View) : MainContract.Presenter {

    init {
        view.onAddButtonPressed { onAddButtonPressed() }
        view.onDecreaseButtonPressed { onDecreaseButtonPressed() }
        view.onResetButtonPressed { onResetButtonPressed() }
    }

    override fun onAddButtonPressed() {
        if (view.editCounter() == NULL_VALUE) {
            view.whatIfUserDoesNotInsertNumber()
        } else {
            model.addToCounter(view.editCounter())
            view.setCounter(model.getCounter()) }
    }

    override fun onDecreaseButtonPressed() {
        if (view.editCounter() == NULL_VALUE) {
            view.whatIfUserDoesNotInsertNumber()
        } else {
            model.subtractFromCounter(view.editCounter())
            view.setCounter(model.getCounter())
        }
    }

    override fun onResetButtonPressed() {
        model.reset()
        view.setCounter(model.getCounter())
    }
}
