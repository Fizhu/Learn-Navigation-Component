package com.fizhu.learnnavigationcomponent.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavDeepLinkBuilder
import com.fizhu.learnnavigationcomponent.R

class NavActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav)
        onInit()
    }

    private fun onInit() {

    }
}
