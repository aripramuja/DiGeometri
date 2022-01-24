package com.digeometri.digeometri

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataClient {
    private  const val BASEURL ="http://127.0.0.1:8000"
    val instant:Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(Api:: class.java)
    }
}