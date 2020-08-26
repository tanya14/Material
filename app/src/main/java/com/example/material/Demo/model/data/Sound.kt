package com.example.tStringa.myapplication.Login.model.data

import com.example.tanya.myapplication.Login.model.data.AudioPath
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class Sound {
    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("audio_path")
    @Expose
    var audioPath: AudioPath? = null

    @SerializedName("sound_name")
    @Expose
    var soundName: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("thum")
    @Expose
    var thum: String? = null

    @SerializedName("section")
    @Expose
    var section: String? = null

    @SerializedName("created")
    @Expose
    var created: String? = null
}