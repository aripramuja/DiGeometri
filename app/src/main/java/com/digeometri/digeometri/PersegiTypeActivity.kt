package com.digeometri.digeometri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PersegiTypeActivity : AppCompatActivity() {
    lateinit var flatKelilingBtn : ImageView
    lateinit var flatKeliling2Btn : TextView
    lateinit var flatLuasBtn : ImageView
    lateinit var flatLuas2Btn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_type)

        flatKelilingBtn = findViewById(R.id.btnFlatKeliling)
        flatLuasBtn = findViewById(R.id.btnFlatLuas)
        flatKeliling2Btn = findViewById(R.id.btnFlatKeliling2)
        flatLuas2Btn = findViewById(R.id.btnFlatLuas2)

        flatKelilingBtn.setOnClickListener {
            startActivity(Intent(this,PersegiMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatKeliling2Btn.setOnClickListener {
            startActivity(Intent(this,PersegiMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatLuasBtn.setOnClickListener {
            startActivity(Intent(this,PersegiMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatLuas2Btn.setOnClickListener {
            startActivity(Intent(this,PersegiMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

    }
}