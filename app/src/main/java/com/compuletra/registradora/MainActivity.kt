package com.compuletra.registradora

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.compuletra.registradora.databinding.MainActivityBinding
import com.compuletra.registradora.databinding.SangriaDeMoedasBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private lateinit var _binding: SangriaDeMoedasBinding

    @SuppressLint("AppCompatMethod")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        botaoSangriaDeMoedas_Main()
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    fun botaoSangriaDeMoedas_Main() {
        binding.botaoSangriaDeMoedas.setOnClickListener {
            _binding = SangriaDeMoedasBinding.inflate(layoutInflater)
            val view = _binding.root
            setContentView(view)
        }
    }
    fun botaoVoltar_Sangria(){
        _binding.botaoVoltaSangria.setOnClickListener {
            binding = MainActivityBinding.inflate(layoutInflater)
            val view = _binding.root
            setContentView(view)
        }
    }

} //
//    fun chamaBinding(bindingChamado: Char) {
//        binding.bindingChamado.setOnClickListener {
//            _binding = SangriaDeMoedasBinding.inflate(layoutInflater)
//            val view = _binding.root
//            setContentView(view)
//        }
//    }
//
//    fun navigateToNextScreen(binding: binding) {
//        val navController = NavHostFragment.findNavController(this)
//        binding.button.setOnClickListener {
//            navController.navigate(R.id.action_current_fragment_to_next_fragment)
//        }
//    }
//}
