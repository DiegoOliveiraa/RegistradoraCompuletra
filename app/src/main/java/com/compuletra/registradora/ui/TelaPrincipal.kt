package com.compuletra.registradora.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.compuletra.registradora.R
import com.compuletra.registradora.bancodedados.AppDatabase
import com.compuletra.registradora.bancodedados.User
import com.compuletra.registradora.databinding.MainActivityBinding
import com.compuletra.registradora.funcoes.EditaBotoes

class TelaPrincipal : Fragment(R.layout.main_activity) {
    private var _binding: MainActivityBinding? = null
    private lateinit var botoes: EditaBotoes
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = MainActivityBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.botaoSangriaDeMoedas.setOnClickListener {
            val action = TelaPrincipalDirections.botaoSangriaDeMoedas()
            findNavController().navigate(action)

            val context = requireContext()
            val db = Room.databaseBuilder(
                context,
                AppDatabase::class.java, "database-name"
            ).build()

            val userDao = db.userDao()

            userDao?.adicionar(
                User(1, cincoCents = 5.0)
            )?.let { it1 ->
                botoes.editaBotoesMais(binding.fabMenos50, binding.qnt5Cents, 5.00, it1
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}