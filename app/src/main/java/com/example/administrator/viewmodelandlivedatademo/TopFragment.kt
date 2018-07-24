package com.example.administrator.viewmodelandlivedatademo

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.top_layout.view.*

class TopFragment : Fragment() {

    lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.top_layout, container, false)

        /** 監聽MainViewModel的firstName, 如果它被改變了, 就將改變後的值賦予welcomeMessageTextView */
        viewModel = ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java)
        viewModel.firstName.observe(this, Observer {
            view.welcomeMessageTextView.text = it
        })

        return view
    }
}