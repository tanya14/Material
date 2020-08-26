package com.example.tanya.myapplication.Login.model.constant

import com.example.tanya.myapplication.Login.model.data.JsonRequestFormat
import com.example.tanya.myapplication.Login.model.data.ResponseJson
import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RestApi {

    @Headers("Content-Type: application/json")
    @POST(Companion.URL)
    fun fetchData(@Body jsonRequestFormat: JsonRequestFormat): Call<ResponseJson>

    data class RequestData(
            @SerializedName("fb_id") var fbId: String
    )

    companion object {
        var BASE_URL = "http://heartover.com/tictok/API/"
        const val URL = "http://heartover.com/tictok/API/index.php?p=showAllVideos"
    }
}