package com.lordtaylor.mvvm_room_db_other.presistance_room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.lordtaylor.mvvm_room_db_other.models.FirstItem

@Dao
interface AppDao {

    @Query("SELECT * FROM FirstItem WHERE name LIKE :search OR description LIKE :search")
    fun getAll(search:String="%"): LiveData<List<FirstItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: FirstItem)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(item: List<FirstItem>?)

    @Query("DELETE from FirstItem")
    fun deleteAll()
}