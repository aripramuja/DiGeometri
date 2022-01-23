package com.digeometri.digeometri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_geometry_types.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GeometryTypesActivity : AppCompatActivity() {
//    lateinit var FlatMainBtn : ImageView
        private  val list = ArrayList<TwoDimentionalResponse>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geometry_types)

        geometry_types.setHasFixedSize(true)
        geometry_types.layoutManager = LinearLayoutManager(this)

        DataClient.instant.getTwoDimentional().enqueue(object : Callback<ArrayList<TwoDimentionalResponse>>{
            override fun onResponse(
                call: Call<ArrayList<TwoDimentionalResponse>>,
                response: Response<ArrayList<TwoDimentionalResponse>>
            ) {
                val responseCode : String = response.code().toString()
                codeRespon.text = responseCode
                response.body()?.let { list.addAll(it)}
                val adapter = TwoDimentionalAdapter(list)
                geometry_types.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<TwoDimentionalResponse>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
//        FlatMainBtn = findViewById(R.id.btnFlatMain)
//        FlatMainBtn.setOnClickListener {
//            startActivity(Intent(this,GeometryMainActivity::class.java))
//            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
//        }
    }
}
