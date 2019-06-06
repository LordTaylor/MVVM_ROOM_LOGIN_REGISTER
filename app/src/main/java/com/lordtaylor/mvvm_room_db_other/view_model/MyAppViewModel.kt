package com.lordtaylor.mvvm_room_db_other.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.lordtaylor.mvvm_room_db_other.repository.FirstRepository

class MyAppViewModel constructor(application: Application) : AndroidViewModel(application) {

    var repo:FirstRepository

    init {
        repo = FirstRepository()
    }
}