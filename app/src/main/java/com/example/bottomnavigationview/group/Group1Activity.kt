package com.example.bottomnavigationview.group

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.groupmembers.MembersActivity

class Group1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group1)

        var back = findViewById<ImageView>(R.id.cros)

        back.setOnClickListener {
            var intent = Intent(this@Group1Activity,MembersActivity::class.java)
            startActivity(intent)
        }
    }
}