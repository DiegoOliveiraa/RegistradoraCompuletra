package com.compuletra.registradora.bancodedados

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun pegarTodos(): List<User>

    @Update
    fun adicionar(vararg users: User)

    @Delete
    fun remover(user: User)
}