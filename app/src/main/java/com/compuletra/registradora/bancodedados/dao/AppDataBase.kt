package com.compuletra.registradora.bancodedados.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

import com.compuletra.registradora.bancodedados.converter.Converters
import com.compuletra.registradora.bancodedados.user.User
import com.compuletra.registradora.bancodedados.userdao.UserDao

@Database(entities = [User::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        private const val DATABASE_NAME = "Compuletra.db"

        @Volatile
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                val databaseBuilder = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                )
                instance = databaseBuilder.build()
                instance!!
            }
        }
    }
}



