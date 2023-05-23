package com.compuletra.registradora.funcoes

import android.widget.Button
import android.widget.TextView
import com.compuletra.registradora.bancodedados.User
import com.compuletra.registradora.bancodedados.UserDao
import com.compuletra.registradora.databinding.MainActivityBinding

class EditaBotoes {
    private lateinit var binding: MainActivityBinding


    //Botoes de adições
    private val botaoAdd5 = binding.fabMais5
    private val botaoAdd10 = binding.fabMais10
    private val botaoAdd25 = binding.fabMais25
    private val botaoAdd50 = binding.fabMais50
    private val botaoAdd1Real = binding.fabMais1Real


    //Botoes de diminuir
    private val botaoRemove5 = binding.fabMenos5
    private val botaoRemove10 = binding.fabMenos10
    private val botaoRemove25 = binding.fabMenos25
    private val botaoRemove50 = binding.fabMenos50
    private val botaoRemove1Real = binding.fabMenos1Real

    fun editaBotoesMais(
        botao: Button,
        campoQuantidade: TextView,
        valorDaMoeda: Double,
        user: User?,
        userDao: UserDao
    ) {
        botao.setOnClickListener {
            val quantidadeDeMoeda = when (valorDaMoeda) {
                0.05 -> user?.cincoCents
                0.10 -> user?.dezCents
                0.25 -> user?.vinteCincoCents
                0.50 -> user?.cinquentaCents
                1.00 -> user?.umReal
                else -> 0.00
            } ?: 0.00

            val novoValor = quantidadeDeMoeda + valorDaMoeda
            campoQuantidade.text = novoValor.toString()

            user?.let {
                when (valorDaMoeda) {
                    0.05 -> it.cincoCents = novoValor
                    0.10 -> it.dezCents = novoValor
                    0.25 -> it.vinteCincoCents = novoValor
                    0.50 -> it.cinquentaCents = novoValor
                    1.00 -> it.umReal = novoValor
                    else -> {}
                }

                // adiciona o usuário no banco de dados usando o UserDao
                userDao.adiciona(it)
            }
        }
    }

}