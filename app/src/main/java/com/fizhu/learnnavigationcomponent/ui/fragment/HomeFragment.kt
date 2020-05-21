package com.fizhu.learnnavigationcomponent.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.fizhu.learnnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by fizhu on 21,May,2020
 * Hvyz.anbiya@gmail.com
 */
class HomeFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onInit()
    }

    private fun onInit() {
        btn_first.setOnClickListener { findNavController().navigate(R.id.firstFragment, null) }
        btn_second.setOnClickListener { findNavController().navigate(R.id.secondFragment, null) }
        btn_third.setOnClickListener { findNavController().navigate(R.id.thirdFragment, null) }
    }

}