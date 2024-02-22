package com.example.bottomnavigationview.comment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.chat.Chat3Activity

class Comment3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment3)
        var chat1 = findViewById<ImageView>(R.id.backbtn3)


        chat1.setOnClickListener {
            var intent = Intent(this@Comment3Activity, Chat3Activity::class.java)
            startActivity(intent)
        }
    }
}