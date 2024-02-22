package com.example.bottomnavigationview.chat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.bottomnavigationview.BuyActivity
import com.example.bottomnavigationview.MainActivity
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.comment.Comment2Activity
import com.example.bottomnavigationview.frgment.HomeFragment

class Chat2Activity : AppCompatActivity() {

    private lateinit var imageView1 : ImageView
    private var isImage1Selected = true

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat2)

        imageView1= findViewById(R.id.likeBtn)


        imageView1.setOnClickListener {
            if (isImage1Selected) {
                imageView1.setImageResource(R.drawable.heart)
                isImage1Selected = false
            } else {
                imageView1.setImageResource(R.drawable.favorite)
                isImage1Selected = true
            }
        }

        var btn = findViewById<ImageView>(R.id.backBtn2)
        var comment2 = findViewById<TextView>(R.id.ViewAll)
        var buy = findViewById<Button>(R.id.bookNow)

        buy.setOnClickListener {
            var intent = Intent(this@Chat2Activity, BuyActivity::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {
            var intent = Intent(this@Chat2Activity, MainActivity::class.java)
            startActivity(intent)
        }
        comment2.setOnClickListener {
            var intent = Intent(this@Chat2Activity, Comment2Activity::class.java)
            startActivity(intent)
        }

    }
}