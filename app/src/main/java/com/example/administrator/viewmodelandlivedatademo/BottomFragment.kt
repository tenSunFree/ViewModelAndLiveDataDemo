package com.example.administrator.viewmodelandlivedatademo

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.bottom_layout.view.*

class BottomFragment : Fragment() {

    lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.bottom_layout, container, false)

        /** 取得providedFirstNameEditText輸入的值, 並賦予MainViewModel的firstName, 改變它 */
        viewModel = ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java)
        view.submitButton.setOnClickListener {
            viewModel.firstName.value = view.feelFreeToTypeEditText.text.toString()
        }

        return view
    }
}