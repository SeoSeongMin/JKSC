package com.camper.android

import android.app.Application

class App : Application() {

    init {
        INSTANCE = this
    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        lateinit var INSTANCE: App
        var loginFlag : Int = 0
    }

    // loginFlag = 0 -> no login
    // loginFlag = 1 -> guest
    // loginFlag = 2 -> host

    fun setLoginFlag(state: Int){
        loginFlag = state
    }

    fun getLoginFlag(): Int {
        return loginFlag
    }
}