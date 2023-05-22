package com.compuletra.registradora.funcoes

import android.widget.Button
import android.widget.TextView
import com.compuletra.registradora.bancodedados.User
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



}