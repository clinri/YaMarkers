package ru.netology.yamarkers.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ru.netology.yamarkers.dao.PlaceDao
import ru.netology.yamarkers.entity.PlaceEntity

@Database(entities = [PlaceEntity::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract val placeDao: PlaceDao

    companion object {
        @Volatile
        private var INSTANCE: PlaceDatabase? = null

        fun getInstance(context: Context): PlaceDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(context, PlaceDatabase::class.java, "places_db")
                    .build()
                    .also {
                        INSTANCE = it
                    }
            }
    }
}
