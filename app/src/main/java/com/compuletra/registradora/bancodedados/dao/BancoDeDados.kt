package com.compuletra.registradora.bancodedados.dao


import androidx.room.Database
import androidx.room.RoomDatabase
import com.compuletra.registradora.bancodedados.User
import com.compuletra.registradora.bancodedados.UserDao

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}