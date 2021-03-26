package com.example.myapplicationmoxy.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationmoxy.R
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter

class HomeFragment : MvpAppCompatFragment(), HomeView {

   lateinit var textView: TextView

    @InjectPresenter
    lateinit var presenter: HomePresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
         textView = root.findViewById(R.id.text_home)

        return root
    }

    override fun initView() {
       textView.text =  "TODO"
    }
}