package com.example.tiketta.database

import android.media.ImageWriter
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Akun(
    @ColumnInfo(name= "username")
    @field:SerializedName("username")
    var username : String = "",

    @ColumnInfo(name= "Email")
    @field:SerializedName("Email")
    var Email : String = "",

    @ColumnInfo(name= "password")
    @field:SerializedName("password")
    var password : String = "",

    @PrimaryKey
    @ColumnInfo(name = "id")
    @field:SerializedName("id")
    var id: Int? = null,
)

//    @ColumnInfo(name = "profile_path")
//    @field:SerializedName("profile_path")
//    var profile_path: String? = ""