package com.compuletra.registradora.bancodedados.userdao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.compuletra.registradora.bancodedados.user.User

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