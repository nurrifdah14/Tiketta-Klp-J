package com.example.tiketta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.example.tiketta.database.Akun
import com.example.tiketta.database.AkunSignUpViewModel
import com.example.tiketta.database.AppDatabase
import com.example.tiketta.database.Repository
import com.example.tiketta.databinding.ActivityBaseBinding
import com.example.tiketta.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignUpBinding
    private lateinit var akunSignUpViewModel: AkunSignUpViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSignUp.setOnClickListener {
                val email= tietEmail.text.toString()
                val username= tietUsername.text.toString()
                val password = tietPassword.text.toString()

                val akun= Akun(username, email, password)
                akunSignUpViewModel= AkunSignUpViewModel()
                akunSignUpViewModel.repository= Repository(AppDatabase.getDatabase(this@SignUpActivity))
                akunSignUpViewModel.addAkun(akun)
            }
        }
    }
}