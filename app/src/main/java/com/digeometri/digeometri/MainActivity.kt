package com.digeometri.digeometri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var FlatTypeBtn : ImageView
    lateinit var SpaceTypeBtn : ImageView
    lateinit var  FlatTypeBtn2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FlatTypeBtn = findViewById(R.id.btnFlatType)
        SpaceTypeBtn = findViewById(R.id.btnSpaceType)
        FlatTypeBtn2 = findViewById(R.id.btnFlatType2)

        FlatTypeBtn.setOnClickListener {
            startActivity(Intent(this,GeometryTypesActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }
        SpaceTypeBtn.setOnClickListener {
            startActivity(Intent(this,GeometryTypesActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }
        FlatTypeBtn2.setOnClickListener {
            startActivity(Intent(this,GeometryTypesActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }


    }
}
