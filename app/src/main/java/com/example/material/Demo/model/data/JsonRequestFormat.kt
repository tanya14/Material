package com.example.tanya.myapplication.Login.model.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class JsonRequestFormat {
    @SerializedName("fb_id")
    @Expose
    var id: String? = null
}