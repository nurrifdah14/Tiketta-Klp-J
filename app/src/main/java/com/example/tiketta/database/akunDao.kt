package com.example.tiketta.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface akunDao {
    @Query("SELECT * FROM Akun WHERE username=:usernameAkun")
    fun getUserByUsername(usernameAkun: String):Akun

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(akun: Akun)
}