package com.example.tiketta

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiketta.database.AppDatabase
import com.example.tiketta.database.LoginViewModel
import com.example.tiketta.database.Repository
import com.example.tiketta.databinding.FragmentLoginBinding
import com.example.tiketta.databinding.FragmentProfilBinding

class ProfilFragment : Fragment() {
    private lateinit var _binding: FragmentProfilBinding
    private val binding get()=_binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentProfilBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            logout.setOnClickListener {
                val intent= Intent(requireContext(), BaseActivity:: class.java)
                startActivity(intent)
                activity?.finish()

            }
        }
    }

}