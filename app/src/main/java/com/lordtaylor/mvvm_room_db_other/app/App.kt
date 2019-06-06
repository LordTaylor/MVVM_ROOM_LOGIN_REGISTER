package com.lordtaylor.mvvm_room_db_other.app

import com.lordtaylor.mvvm_room_db_other.di.Basic.BasicApp
import com.lordtaylor.mvvm_room_db_other.di.Components.DaggerPresenterComponent
import com.lordtaylor.mvvm_room_db_other.di.Components.PresenterComponent


class App : BasicApp() {

    override fun initApp() {
        injectDependency()
    }

    fun injectDependency() {
        var component: PresenterComponent = DaggerPresenterComponent.create()
        component.inject(this)
    }

}