package com.example.calculaflex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.calculaflex.utils.CalculaFlexTracker
import com.example.calculaflex.utils.ScreenMap

open class BaseActivity : AppCompatActivity() {

    open fun getScreenName(): String {
        return ScreenMap.getScreenNameBy(this)
    }

    override fun onStart() {
        super.onStart()
        CalculaFlexTracker.trackScreen(this, getScreenName())
    }
}
