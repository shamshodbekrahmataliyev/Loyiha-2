package com.example.bottomnavigationview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AddImgActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_img)
        var back = findViewById<ImageView>(R.id.add_img_back)

        back.setOnClickListener {
            var intent = Intent(this@AddImgActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}