package com.digeometri.digeometri

import retrofit2.Call
import retrofit2.http.GET
interface Api {
    @GET(value = "/api-digeometri/twodimentionalcategory/")
    fun getTwoDimentional(): Call<ArrayList<TwoDimentionalResponse>>
}