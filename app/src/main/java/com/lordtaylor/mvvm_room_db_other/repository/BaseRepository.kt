package com.lordtaylor.mvvm_room_db_other.repository

interface BaseRepository {

    fun getAllItems()

    fun insertToDB()

    fun searchForItem(search:String)
}