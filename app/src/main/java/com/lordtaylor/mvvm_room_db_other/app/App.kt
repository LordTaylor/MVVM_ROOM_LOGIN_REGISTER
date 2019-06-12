package com.lordtaylor.mvvm_room_db_other.app

import com.lordtaylor.mvvm_room_db_other.di.Basic.BasicApp
import com.lordtaylor.mvvm_room_db_other.di.Components.DaggerPresenterComponent
import com.lordtaylor.mvvm_room_db_other.di.Components.PresenterComponent
import com.lordtaylor.mvvm_room_db_other.presistance_room.AppDao
import com.lordtaylor.mvvm_room_db_other.presistance_room.AppDatabase
import com.lordtaylor.mvvm_room_db_other.presistance_room.AppDatabase_Impl
import com.lordtaylor.mvvm_room_db_other.repository.BaseRepository
import com.lordtaylor.mvvm_room_db_other.repository.FirstRepository
import com.lordtaylor.mvvm_room_db_other.view_model.AppViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton


class App : BasicApp(), KodeinAware {
    override fun initApp() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val kodein = Kodein.lazy {
        bind<AppDatabase>() with singleton { AppDatabase_Impl() }
        bind<AppDao>() with singleton { instance<AppDatabase>().getDao() }
        bind<BaseRepository>() with singleton { FirstRepository(instance()) }
        bind() from provider { AppViewModelFactory(instance()) }
        /*
        different approach
        bind<AppViewModelFactory>() with provider { AppViewModelFactory(instance()) }
         */
    }


}