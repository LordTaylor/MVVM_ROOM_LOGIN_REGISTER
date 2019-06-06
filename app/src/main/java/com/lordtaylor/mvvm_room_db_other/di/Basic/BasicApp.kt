package com.lordtaylor.mvvm_room_db_other.di.Basic

import android.app.Application

abstract class BasicApp : Application{

    constructor(){
        initApp()
    }

    abstract fun initApp()
}