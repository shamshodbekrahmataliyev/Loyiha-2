package com.example.bottomnavigationview.groupmembers

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.Settings.SettingsActivity

class Chat_ProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_profile)
        var btn = findViewById<CardView>(R.id.nextDeveloper)
        var settings = findViewById<ImageView>(R.id.settings)

        btn.setOnClickListener {
            var intent = Intent(this@Chat_ProfileActivity, MembersActivity::class.java)
            startActivity(intent)
        }
        settings.setOnClickListener {
            var intent = Intent(this@Chat_ProfileActivity, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}