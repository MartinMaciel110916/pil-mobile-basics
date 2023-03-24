package com.example.pilmobilebasics.mvp.contract

interface MainContract {

    interface Presenter {
        fun onAddButtonPressed()
        fun onDecreaseButtonPressed()
        fun onResetButtonPressed()
    }

    interface Model {
        fun getCounter(): String
        fun reset()
        fun addToCounter(editCounter: String)
        fun subtractFromCounter(editCounter: String)
    }

    interface View {
        fun setCounter(counter: String)
        fun onAddButtonPressed(onClick: () -> Unit)
        fun onDecreaseButtonPressed(onClick: () -> Unit)
        fun onResetButtonPressed(onClick: () -> Unit)
        fun editCounter(): String
        fun whatIfUserDoesNotInsertNumber()
    }
}
