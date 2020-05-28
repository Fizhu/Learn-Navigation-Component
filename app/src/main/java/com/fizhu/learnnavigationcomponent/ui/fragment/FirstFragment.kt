package com.fizhu.learnnavigationcomponent.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.fizhu.learnnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * Created by fizhu on 21,May,2020
 * Hvyz.anbiya@gmail.com
 */
class FirstFragment: Fragment() {

    private val args : FirstFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onInit()
    }

    private fun onInit() {
        toolbar_first.title = args.data
        toolbar_first.setNavigationOnClickListener { findNavController().navigateUp() }
        btn_next1.setOnClickListener { findNavController().navigate(R.id.action_firstFragment_to_secondFragment) }
    }

}