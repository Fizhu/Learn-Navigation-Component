package com.fizhu.learnnavigationcomponent.ui.utils

import androidx.navigation.navOptions
import com.fizhu.learnnavigationcomponent.R

/**
 * Created by fizhu on 21,May,2020
 * Hvyz.anbiya@gmail.com
 */

val getAnimSlideNavOption = navOptions {
    anim {
        enter = R.anim.slide_in_right
        exit = R.anim.slide_out_left
        popEnter = R.anim.slide_in_left
        popExit = R.anim.slide_out_right
    }
}

val getAnimNavOption = navOptions {
    anim {
        enter = R.anim.fade_in
        exit = R.anim.fade_out
        popEnter = R.anim.fade_in
        popExit = R.anim.fade_out
    }
}