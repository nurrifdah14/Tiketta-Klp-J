package com.example.tiketta

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.tiketta.database.AppDatabase
import com.example.tiketta.database.LoginViewModel
import com.example.tiketta.database.Repository
import com.example.tiketta.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var _binding:FragmentLoginBinding
    private lateinit var loginViewModel: LoginViewModel
    private val binding get()=_binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentLoginBinding.inflate(inflater)
        loginViewModel = LoginViewModel()
        loginViewModel.repository = Repository(AppDatabase.getDatabase(requireContext()))
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnLogin.setOnClickListener {
                val nama = tietUsername.text.toString()
                val pass = tietPassword.text.toString()

                loginViewModel.getLogin(nama,pass).observe(viewLifecycleOwner,  {
                    if (it != null){
                        val text = "Haiii $nama"
                        val duration = Toast.LENGTH_SHORT

                        val toast = Toast.makeText(context, text, duration)
                        toast.show()
                        val intent = Intent(requireContext(),MenuActivity::class.java)
                        startActivity(intent)
                        activity?.finish()
                    }
                })
            }

            signUp.setOnClickListener{
                val intent = Intent(context, SignUpActivity::class.java)
                startActivity(intent)
            }

        }
    }
}