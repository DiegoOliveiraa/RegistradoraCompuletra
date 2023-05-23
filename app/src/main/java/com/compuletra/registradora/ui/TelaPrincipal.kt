package com.compuletra.registradora.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.compuletra.registradora.R
import com.compuletra.registradora.bancodedados.dao.AppDatabase
import com.compuletra.registradora.bancodedados.User
import com.compuletra.registradora.bancodedados.UserDao
import com.compuletra.registradora.databinding.MainActivityBinding
import com.compuletra.registradora.funcoes.EditaBotoes
import java.math.BigDecimal

class TelaPrincipal : Fragment(R.layout.main_activity) {
    private var _binding: MainActivityBinding? = null
    private lateinit var userDao: UserDao
    private lateinit var botoes: EditaBotoes
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = MainActivityBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.botaoSangriaDeMoedas.setOnClickListener {
            val action = TelaPrincipalDirections.botaoSangriaDeMoedas()
            findNavController().navigate(action)
        }
        // Config Banco de dados
        val context: Context = requireContext()
        val userDao = AppDatabase.getInstance(context).userDao()

        // Novo Usuario
        val userId = 1
        val user = userDao.pegaUsuarioPorId(userId) ?: User(userId)

        botoes.editaBotoesMais(binding.fabMais5,binding.qnt5Cents, BigDecimal("0.05"),user,userDao)


    }

    //    requireContext()
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}