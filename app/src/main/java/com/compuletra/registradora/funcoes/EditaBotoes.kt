package com.compuletra.registradora.funcoes

import android.widget.Button
import android.widget.TextView
import com.compuletra.registradora.bancodedados.User
import com.compuletra.registradora.bancodedados.UserDao
import java.math.BigDecimal

class EditaBotoes {
    fun editaBotoesMais(
        botao: Button,
        campoQuantidade: TextView,
        valorDaMoeda: BigDecimal,
        user: User?,
        userDao: UserDao
    ) {
        botao.setOnClickListener {
            val quantidadeDeMoeda = when (valorDaMoeda) {
                BigDecimal(0.05) -> user?.cincoCents ?: BigDecimal.ZERO
                BigDecimal(0.10) -> user?.dezCents ?: BigDecimal.ZERO
                BigDecimal(0.25) -> user?.vinteCincoCents ?: BigDecimal.ZERO
                BigDecimal(0.50) -> user?.cinquentaCents ?: BigDecimal.ZERO
                BigDecimal(1.00) -> user?.umReal ?: BigDecimal.ZERO
                else -> BigDecimal.ZERO
            }

            val novoValor = quantidadeDeMoeda + valorDaMoeda
            campoQuantidade.text = "$novoValor"

            user?.let {
                when (valorDaMoeda) {
                    BigDecimal(0.05) -> it.cincoCents = novoValor
                    BigDecimal(0.10) -> it.dezCents = novoValor
                    BigDecimal(0.25) -> it.vinteCincoCents = novoValor
                    BigDecimal(0.50) -> it.cinquentaCents = novoValor
                    BigDecimal(1.00) -> it.umReal = novoValor
                    else -> {}
                }

                // adiciona o usuário no banco de dados usando o UserDao
                userDao.adiciona(it)
            }
        }
    }

}