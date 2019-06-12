package com.lordtaylor.mvvm_room_db_other.view_model

import androidx.lifecycle.ViewModel
import com.lordtaylor.mvvm_room_db_other.models.BaseItem
import com.lordtaylor.mvvm_room_db_other.repository.BaseRepository

class MyAppViewModel(private val repository: BaseRepository) : ViewModel() {

    fun addItem(item: BaseItem) = repository.insertToDB(item)
    fun getItems() = repository.getAllItems()
}