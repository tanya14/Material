package com.example.tanya.myapplication.Login.model.data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class AudioPath {
    @SerializedName("mp3")
    @Expose
    var mp3: String? = null

    @SerializedName("acc")
    @Expose
    var acc: String? = null
}