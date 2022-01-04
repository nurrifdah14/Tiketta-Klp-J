package com.example.tiketta.database

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Repository(val appDatabase: AppDatabase) {
    private lateinit var mAkun: MutableLiveData<Akun>
    private lateinit var mAkunLogin: MutableLiveData<Akun>
    fun addAkun(akun: Akun){
        CoroutineScope(Dispatchers.IO).launch {
            appDatabase.akunDao().insertAll(akun)
        }
    }

    fun getUser(username:String): LiveData<Akun>{
        CoroutineScope(Dispatchers.IO).launch {
            val akun = appDatabase.akunDao().getUserByUsername(username)
            mAkun.postValue(akun)
        }
        return mAkun
    }

    fun login(email:String, password:String){
        mAkunLogin = MutableLiveData()
        CoroutineScope(Dispatchers.IO).launch {
            val akun = appDatabase.akunDao().getUserByUsernamePass(email,password)
            mAkunLogin.postValue(akun)
        }
    }

    fun getLogin():LiveData<Akun>{
        return mAkunLogin
    }
}