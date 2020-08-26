package com.example.tanya.myapplication.Login.model.data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class Count {
    @SerializedName("like_count")
    @Expose
    var likeCount: String? = null

    @SerializedName("video_comment_count")
    @Expose
    var videoCommentCount: String? = null
}