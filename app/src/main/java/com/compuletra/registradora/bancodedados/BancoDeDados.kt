package com.compuletra.registradora.bancodedados

import androidx.room.Database
import androidx.room.RoomDatabase
import com.google.firebase.firestore.auth.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao?
}