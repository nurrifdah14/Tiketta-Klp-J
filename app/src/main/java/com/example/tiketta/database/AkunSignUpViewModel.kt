package com.example.tiketta.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AkunSignUpViewModel: ViewModel() {
    lateinit var repository: Repository

    fun addAkun(akun: Akun){
        repository.addAkun(akun)

    }

    fun getUser(username:String):LiveData<Akun>{
        return repository.getUser(username)
    }
}