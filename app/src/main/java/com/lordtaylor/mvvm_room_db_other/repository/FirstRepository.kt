package com.lordtaylor.mvvm_room_db_other.repository

import com.lordtaylor.mvvm_room_db_other.models.BaseItem
import com.lordtaylor.mvvm_room_db_other.presistance_room.AppDao

class FirstRepository (private val dbDao: AppDao):BaseRepository{
    override fun insertToDB(item: BaseItem) {

    }

    override fun searchForItem(search: String) {
    }

    override fun getAllItems() {
    }
}