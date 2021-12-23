package com.example.tiketta

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnLogin.setOnClickListener {
                val nama = tietUsername.text.toString()
                val text = "Haiii $nama"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(context, text, duration)
                toast.show()
            }

            signUp.setOnClickListener{
                val intent = Intent(context, SignUpActivity::class.java)
                startActivity(intent)
            }

        }
    }
}