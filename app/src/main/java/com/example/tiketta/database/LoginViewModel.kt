package com.example.tiketta.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    lateinit var repository: Repository

    fun getLogin(email:String, password: String): LiveData<Akun> {
        repository.login(email,password)
        return repository.getLogin()
    }
}