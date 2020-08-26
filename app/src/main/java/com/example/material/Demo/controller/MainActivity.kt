package com.example.material.Demo.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.material.R
import com.example.tanya.myapplication.Login.model.constant.RestApi
import com.example.tanya.myapplication.Login.model.data.JsonRequestFormat
import com.example.tanya.myapplication.Login.model.data.ResponseJson
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.signup_layout.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListener()
        callApi()
    }

    private fun setOnClickListener() {
        val listener = View.OnClickListener { view ->
            when (view.id) {
                R.id.signUpBtn -> {
                    val intent = Intent(this, SignUp::class.java)
                    startActivity(intent)
                }
                R.id.login -> {
                    val intent = Intent(this, SignUp::class.java)
                    startActivity(intent)
                }
            }
        }
        signUpBtn?.setOnClickListener(listener)
        login?.setOnClickListener(listener)
    }

    override fun onResume() {
        super.onResume()

    }

    private fun callApi() {
        val retrofit = Retrofit.Builder()
            .baseUrl(RestApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val api = retrofit.create(RestApi::class.java)
        val jsonRequestFormat = JsonRequestFormat()
        jsonRequestFormat.id = "0"
        val call = api.fetchData(jsonRequestFormat)
        call.enqueue(object : Callback<ResponseJson> {
            override fun onResponse(call: Call<ResponseJson>, response: Response<ResponseJson>) {
                Log.e("JSON Response::", Gson().toJson(response.body()))
            }

            override fun onFailure(call: Call<ResponseJson>, t: Throwable) {
                Log.e("JSON Response::", t.message)
            }
        })

    }
}
