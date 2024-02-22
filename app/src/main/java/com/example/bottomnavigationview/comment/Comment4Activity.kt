package com.example.bottomnavigationview.comment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.chat.Chat4Activity

class Comment4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment4)
        var chat1 = findViewById<ImageView>(R.id.backbtn4)


        chat1.setOnClickListener {
            var intent = Intent(this@Comment4Activity, Chat4Activity::class.java)
            startActivity(intent)
        }
    }
}