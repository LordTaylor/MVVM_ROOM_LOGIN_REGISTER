package com.lordtaylor.mvvm_room_db_other.repository

import com.lordtaylor.mvvm_room_db_other.models.BaseItem

interface BaseRepository {

    fun getAllItems()

    fun insertToDB(item: BaseItem)

    fun searchForItem(search:String)
}