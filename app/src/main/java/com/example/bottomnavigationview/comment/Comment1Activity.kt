package com.example.bottomnavigationview.comment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.chat.Chat1Activity

class Comment1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment1)
        var chat1 = findViewById<ImageView>(R.id.bacbktn1)


        chat1.setOnClickListener {
            var intent = Intent(this@Comment1Activity, Chat1Activity::class.java)
            startActivity(intent)
        }
    }
}