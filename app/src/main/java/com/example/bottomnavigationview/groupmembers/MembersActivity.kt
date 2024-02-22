package com.example.bottomnavigationview.groupmembers

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.bottomnavigationview.R
import com.example.bottomnavigationview.group.Group10Activity
import com.example.bottomnavigationview.group.Group1Activity
import com.example.bottomnavigationview.group.Group2Activity
import com.example.bottomnavigationview.group.Group3Activity
import com.example.bottomnavigationview.group.Group4Activity
import com.example.bottomnavigationview.group.Group5Activity
import com.example.bottomnavigationview.group.Group6Activity
import com.example.bottomnavigationview.group.Group7Activity
import com.example.bottomnavigationview.group.Group8Activity
import com.example.bottomnavigationview.group.Group9Activity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MembersActivity : AppCompatActivity() {

    private lateinit var imageView1 : ImageView
    private lateinit var imageView2 : ImageView
    private lateinit var imageView3 : ImageView
    private lateinit var imageView4 : ImageView
    private lateinit var imageView5 : ImageView
    private lateinit var imageView6 : ImageView
    private lateinit var imageView7 : ImageView
    private lateinit var imageView8 : ImageView
    private lateinit var imageView9 : ImageView
    private lateinit var imageView10: ImageView
    private var isImage1Selected = true
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_members)

        val group1:ImageView = findViewById(R.id.group1)
        val group2:ImageView = findViewById(R.id.group2)
        val group3:ImageView = findViewById(R.id.group3)
        val group4:ImageView = findViewById(R.id.group4)
        val group5:ImageView = findViewById(R.id.group5)
        val group6:ImageView = findViewById(R.id.group6)
        val group7:ImageView = findViewById(R.id.group7)
        val group8:ImageView = findViewById(R.id.group8)
        val group9:ImageView = findViewById(R.id.group9)
        val group10:ImageView = findViewById(R.id.group10)

        group1.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group1,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group2.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group2,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group3.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group3,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group4.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group4,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group5.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group5,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group6.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group6,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group7.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group7,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group8.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group8,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group9.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group9,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
        group10.setOnClickListener {
            val view:View = layoutInflater.inflate(R.layout.activity_group10,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }

        val btn = findViewById<ImageView>(R.id.backMambers)

        btn.setOnClickListener {
            var intent = Intent(this@MembersActivity,Chat_ProfileActivity::class.java)
            startActivity(intent)
        }

        imageView1 = findViewById(R.id.notifiacation1)
        imageView2 = findViewById(R.id.notifiacation2)
        imageView3 = findViewById(R.id.notifiacation3)
        imageView4 = findViewById(R.id.notifiacation4)
        imageView5 = findViewById(R.id.notifiacation5)
        imageView6 = findViewById(R.id.notifiacation6)
        imageView7 = findViewById(R.id.notifiacation7)
        imageView8 = findViewById(R.id.notifiacation8)
        imageView9 = findViewById(R.id.notifiacation9)
        imageView10= findViewById(R.id.notifiacation10)


        imageView1.setOnClickListener {
            if (isImage1Selected) {
                imageView1.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView1.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView2.setOnClickListener {
            if (isImage1Selected) {
                imageView2.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView2.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView3.setOnClickListener {
            if (isImage1Selected) {
                imageView3.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView3.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView4.setOnClickListener {
            if (isImage1Selected) {
                imageView4.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView4.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView5.setOnClickListener {
            if (isImage1Selected) {
                imageView5.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView5.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView6.setOnClickListener {
            if (isImage1Selected) {
                imageView6.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView6.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView7.setOnClickListener {
            if (isImage1Selected) {
                imageView7.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView7.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView8.setOnClickListener {
            if (isImage1Selected) {
                imageView8.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView8.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView9.setOnClickListener {
            if (isImage1Selected) {
                imageView9.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView9.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }

        imageView10.setOnClickListener {
            if (isImage1Selected) {
                imageView10.setImageResource(R.drawable.mute_notification)
                isImage1Selected = false
            } else {
                imageView10.setImageResource(R.drawable.notification)
                isImage1Selected = true
            }
        }


    }
}