package com.compuletra.registradora.bancodedados

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {
    @Query("SELECT * FROM users WHERE `key` = :key")
    fun pegaUsuarioPorId(key: Int): User?

    @Update
    fun atualiza(vararg user: User)

    @Insert
    fun adiciona(vararg user: User)

    @Delete
    fun remover(user: User)
}