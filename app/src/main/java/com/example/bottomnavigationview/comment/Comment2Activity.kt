package com.example.bottomnavigationview.comment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.chat.Chat2Activity

class Comment2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment2)
        var chat1 = findViewById<ImageView>(R.id.backbtn2)


        chat1.setOnClickListener {
            var intent = Intent(this@Comment2Activity, Chat2Activity::class.java)
            startActivity(intent)
        }    }
}