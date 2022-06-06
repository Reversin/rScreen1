package com.example.rscreen1.contract

interface AddContract : BaseContract {
    interface View : BaseContract.View {
        fun showOneScreen(positionAnimation : IntArray)

        fun showDashboardScreen()

    }

}