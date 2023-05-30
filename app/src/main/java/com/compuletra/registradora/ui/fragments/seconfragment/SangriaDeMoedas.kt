package com.compuletra.registradora.ui.fragments.seconfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.compuletra.registradora.R
import com.compuletra.registradora.databinding.SangriaDeMoedasBinding

class SangriaDeMoedas : Fragment(R.layout.sangria_de_moedas) {

    private var _binding: SangriaDeMoedasBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SangriaDeMoedasBinding.inflate(inflater, container, false)
        return binding.root

    }

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