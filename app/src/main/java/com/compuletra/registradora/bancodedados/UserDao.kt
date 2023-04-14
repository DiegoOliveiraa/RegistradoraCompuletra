package com.compuletra.registradora.bancodedados

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Update
    fun adicionar(vararg users: User)

    @Delete
    fun remover(user: User)
}