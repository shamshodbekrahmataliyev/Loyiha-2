package com.example.bottomnavigationview.Settings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.groupmembers.Chat_ProfileActivity
import com.example.bottomnavigationview.groupmembers.MembersActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        var back = findViewById<CardView>(R.id.imgBack)

        back.setOnClickListener {
            var intent = Intent(this@SettingsActivity, Chat_ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}