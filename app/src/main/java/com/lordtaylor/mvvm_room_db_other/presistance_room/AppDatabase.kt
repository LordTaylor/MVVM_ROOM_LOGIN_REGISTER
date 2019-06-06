package com.lordtaylor.mvvm_room_db_other.presistance_room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lordtaylor.mvvm_room_db_other.models.FirstItem

@Database(entities = arrayOf(FirstItem::class),version = 1,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {


    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = INSTANCE ?: synchronized(LOCK) {
            INSTANCE ?: getInstance(context).also { INSTANCE = it }
        }

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context, AppDatabase::class.java, "AppDatabase.db").build()
                }
            }
            return INSTANCE
        }
        fun destroyInstance(){
            INSTANCE = null
        }
    }
}