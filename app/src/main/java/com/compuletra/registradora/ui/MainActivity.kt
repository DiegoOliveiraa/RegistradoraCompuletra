package com.compuletra.registradora.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.compuletra.registradora.databinding.ContentMainActivityBinding
import com.compuletra.registradora.databinding.SangriaDeMoedasBinding


class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ContentMainActivityBinding
    private lateinit var _binding: SangriaDeMoedasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ContentMainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}