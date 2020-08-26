package com.example.tanya.myapplication.Login.model.data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class ResponseJson {
    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("msg")
    @Expose
    var msg: List<Msg>? = null
}