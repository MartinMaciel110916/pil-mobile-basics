package com.example.pilmobilebasics

import com.example.pilmobilebasics.mvp.contract.MainContract
import com.example.pilmobilebasics.mvp.model.MainModel
import com.example.pilmobilebasics.mvp.presenter.MainPresenter
import com.example.pilmobilebasics.util.Constants.ZERO
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {

    private lateinit var presenter: MainContract.Presenter
    private lateinit var model: MainContract.Model

    @MockK
    private lateinit var view: MainContract.View

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxed = true)
        model = MainModel()
        presenter = MainPresenter(model, view)
    }

    @Test
    fun `on add button pressed, the counter value should increment`() {
        val currentCounter = "10"
        val counterAdder = "5"
        every { view.editCounter() } returns counterAdder
        every { view.onAddButtonPressed { view.editCounter() } } returns view.setCounter(currentCounter)
        presenter.onAddButtonPressed()
        verify { view.setCounter(model.getCounter()) }
    }

    @Test
    fun `on decrease button pressed, the counter value should decrement`() {
        val currentCounter = "10"
        val counterDecrease = "5"
        every { view.editCounter() } returns counterDecrease
        every { view.onDecreaseButtonPressed { view.editCounter() } } returns view.setCounter(currentCounter)
        presenter.onDecreaseButtonPressed()
        verify { view.setCounter(model.getCounter()) }
    }

    @Test
    fun `on reset button pressed, the counter value should go back to 0`() {
        val currentCounter = "1"
        every { view.onResetButtonPressed { view.setCounter(currentCounter) } } returns view.setCounter(ZERO.toString())
        presenter.onResetButtonPressed()
        verify { view.setCounter(ZERO.toString()) }
    }

    @Test
    fun `on add button pressed, what if user did not insert a number`() {
        val counterAdder = ""
        every { view.editCounter() } returns counterAdder
        presenter.onAddButtonPressed()
        verify { view.whatIfUserDoesNotInsertNumber() }
    }

    @Test
    fun `on add decrease pressed, what if user did not insert a number`() {
        val counterAdder = ""
        every { view.editCounter() } returns counterAdder
        presenter.onDecreaseButtonPressed()
        verify { view.whatIfUserDoesNotInsertNumber() }
    }
}
