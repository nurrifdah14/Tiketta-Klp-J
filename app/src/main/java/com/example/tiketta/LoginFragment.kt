package com.example.tiketta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiketta.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var _binding:FragmentLoginBinding
    private val binding get()=_binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentLoginBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }
}