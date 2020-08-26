package com.example.tanya.myapplication.Login.model.data

import com.example.tStringa.myapplication.Login.model.data.Sound
import com.example.tStringa.myapplication.Login.model.data.UserInfo
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class Msg {
    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("fb_id")
    @Expose
    var fbId: String? = null

    @SerializedName("user_info")
    @Expose
    var userInfo: UserInfo? = null

    @SerializedName("count")
    @Expose
    var count: Count? = null

    @SerializedName("liked")
    @Expose
    var liked: String? = null

    @SerializedName("video")
    @Expose
    var video: String? = null

    @SerializedName("thum")
    @Expose
    var thum: String? = null

    @SerializedName("gif")
    @Expose
    var gif: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("sound")
    @Expose
    var sound: Sound? = null

    @SerializedName("created")
    @Expose
    var created: String? = null
}