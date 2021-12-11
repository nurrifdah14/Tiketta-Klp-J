package com.example.tiketta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tiketta.databinding.FragmentLoginBinding
import com.example.tiketta.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    private lateinit var _binding: FragmentSignUpBinding
    private val binding get()=_binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }
}