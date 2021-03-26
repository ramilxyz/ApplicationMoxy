package com.example.myapplicationmoxy.ui.home

import moxy.MvpPresenter

class HomePresenter : MvpPresenter<HomeView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.initView()
    }
}