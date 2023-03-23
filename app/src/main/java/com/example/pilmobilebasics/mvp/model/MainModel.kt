package com.example.pilmobilebasics.mvp.model

import com.example.pilmobilebasics.mvp.contract.MainContract
import com.example.pilmobilebasics.util.Constants.ZERO

class MainModel : MainContract.Model {

    private var counter = ZERO

    override fun getCounter(): String = counter.toString()

    override fun reset() {
        counter = ZERO
    }
}
