package com.example.tStringa.myapplication.Login.model.data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class UserInfo {
    @SerializedName("first_name")
    @Expose
    var firstName: String? = null

    @SerializedName("last_name")
    @Expose
    var lastName: String? = null

    @SerializedName("profile_pic")
    @Expose
    var profilePic: String? = null

    @SerializedName("username")
    @Expose
    var username: String? = null

    @SerializedName("verified")
    @Expose
    var verified: String? = null
}