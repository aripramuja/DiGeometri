package com.digeometri.digeometri

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DatarTypesActivity : AppCompatActivity() {

    lateinit var flatSgtBtn : ImageView
    lateinit var flatPsgBtn : ImageView
    lateinit var flatPPBtn : ImageView
    lateinit var flatLkgBtn : ImageView
    lateinit var flatJGBtn : ImageView
    lateinit var flatLLBtn : ImageView
    lateinit var flatTrapBtn : ImageView
    lateinit var flatBKBtn : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datar_types)

        flatSgtBtn = findViewById(R.id.btnFlatSegitiga)
        flatPsgBtn = findViewById(R.id.btnFlatPersegi)
        flatPPBtn = findViewById(R.id.btnFlatPerPanjang)
        flatLkgBtn = findViewById(R.id.btnFlatLingkaran)
        flatJGBtn = findViewById(R.id.btnFlatJarGen)
        flatLLBtn = findViewById(R.id.btnFlatLayang2)
        flatTrapBtn = findViewById(R.id.btnFlatTrapesium)
        flatBKBtn = findViewById(R.id.btnFlatBlhKetupat)

        flatSgtBtn.setOnClickListener {
            startActivity(Intent(this,SegitigaTypeActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatPsgBtn.setOnClickListener {
            startActivity(Intent(this,PersegiTypeActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatPPBtn.setOnClickListener {
            startActivity(Intent(this,PPanjangMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatLkgBtn.setOnClickListener {
            startActivity(Intent(this,LingkaranMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatJGBtn.setOnClickListener {
            startActivity(Intent(this,JarGenMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatLLBtn.setOnClickListener {
            startActivity(Intent(this,Layang2MainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatTrapBtn.setOnClickListener {
            startActivity(Intent(this,TrapesiumMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }

        flatBKBtn.setOnClickListener {
            startActivity(Intent(this,BlhKetupatMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }
    }
}
        
//
