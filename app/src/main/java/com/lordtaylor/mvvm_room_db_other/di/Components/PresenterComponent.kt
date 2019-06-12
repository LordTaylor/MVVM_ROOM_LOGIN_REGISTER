package com.lordtaylor.mvvm_room_db_other.di.Components

import com.lordtaylor.mvvm_room_db_other.views.actiietis.MainActivity
import com.lordtaylor.mvvm_room_db_other.di.Basic.BasicApp
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface PresenterComponent{
    fun inject(basicApp: BasicApp)
    fun inject(activity: MainActivity)
}