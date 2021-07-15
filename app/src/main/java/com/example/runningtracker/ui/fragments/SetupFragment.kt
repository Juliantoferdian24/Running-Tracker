package com.example.runningtracker.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.runningtracker.R
import com.example.runningtracker.databinding.FragmentRunBinding
import com.example.runningtracker.databinding.FragmentSetupBinding
import com.example.runningtracker.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

class SetupFragment : Fragment(R.layout.fragment_setup) {

    private var _binding: FragmentSetupBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSetupBinding.bind(view)

        binding.tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragment_to_runFragment)
        }
    }
}