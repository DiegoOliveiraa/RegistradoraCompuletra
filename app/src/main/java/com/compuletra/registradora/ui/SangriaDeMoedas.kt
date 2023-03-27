package com.compuletra.registradora.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.compuletra.registradora.R
import com.compuletra.registradora.databinding.SangriaDeMoedasBinding

class SangriaDeMoedas : Fragment(R.layout.sangria_de_moedas) {

    private val args: SangriaDeMoedasArgs by navArgs<SangriaDeMoedasArgs>()
    private var _binding: SangriaDeMoedasBinding? = null

    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.botaoVoltaSangria.setOnClickListener {
            findNavController().navigate(R.id.botaoVoltaSangria)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}