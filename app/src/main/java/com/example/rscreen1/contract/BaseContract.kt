package com.example.rscreen1.contract

interface BaseContract {
    interface View

    interface Presenter<V : View> {
        fun onViewCreated()
    }
}