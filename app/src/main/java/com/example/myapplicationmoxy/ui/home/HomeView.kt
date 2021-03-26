package com.example.myapplicationmoxy.ui.home

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

interface HomeView : MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun initView()
}