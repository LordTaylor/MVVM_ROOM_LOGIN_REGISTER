package com.lordtaylor.mvvm_room_db_other.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lordtaylor.mvvm_room_db_other.repository.BaseRepository

class AppViewModelFactory(private val repository:BaseRepository) :ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MyAppViewModel(repository)as T
    }
}