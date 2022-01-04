package com.example.tiketta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiketta.databinding.FragmentHomeBinding
import com.example.tiketta.databinding.FragmentLoginBinding

class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private val binding get()=_binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}