package com.compuletra.registradora.bancodedados

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM User")
    fun pegarTodos(): List<User>

    @Update
    fun atualizar(vararg user: User)

    @Insert
    fun adiciona(vararg user: User)

    @Delete
    fun remover(user: User)
}