package com.example.bottomnavigationview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.bottomnavigationview.chat.Chat1Activity
import com.example.bottomnavigationview.chat.Chat2Activity
import com.example.bottomnavigationview.chat.Chat3Activity
import com.example.bottomnavigationview.chat.Chat4Activity
import com.example.bottomnavigationview.databinding.ActivityMainBinding
import com.example.bottomnavigationview.groupmembers.Chat_ProfileActivity
import com.example.bottomnavigationview.java.JavaActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private lateinit var imageView1 : ImageView
    private lateinit var imageView2 : ImageView
    private lateinit var imageView3 : ImageView
    private lateinit var imageView4 : ImageView
    private var isImage1Selected = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageView1= findViewById(R.id.likebtn)
        imageView2= findViewById(R.id.likebtn2)
        imageView3= findViewById(R.id.likebtn3)
        imageView4= findViewById(R.id.likebtn4)


        imageView1.setOnClickListener {
            if (isImage1Selected) {
                imageView1.setImageResource(R.drawable.heart)
                isImage1Selected = false
            } else {
                imageView1.setImageResource(R.drawable.favorite)
                isImage1Selected = true
            }
        }
        imageView2.setOnClickListener {
            if (isImage1Selected) {
                imageView2.setImageResource(R.drawable.heart)
                isImage1Selected = false
            } else {
                imageView2.setImageResource(R.drawable.favorite)
                isImage1Selected = true
            }
        }
        imageView3.setOnClickListener {
            if (isImage1Selected) {
                imageView3.setImageResource(R.drawable.heart)
                isImage1Selected = false
            } else {
                imageView3.setImageResource(R.drawable.favorite)
                isImage1Selected = true
            }
        }
        imageView4.setOnClickListener {
            if (isImage1Selected) {
                imageView4.setImageResource(R.drawable.heart)
                isImage1Selected = false
            } else {
                imageView4.setImageResource(R.drawable.favorite)
                isImage1Selected = true
            }
        }

        var  filters = findViewById<CardView>(R.id.filters)
        var  btn1 = findViewById<CardView>(R.id.img1)
        var  btn2 = findViewById<CardView>(R.id.img2)
        var  btn3 = findViewById<CardView>(R.id.img3)
        var  btn4 = findViewById<CardView>(R.id.img4)
        var  edit = findViewById<ImageView>(R.id.edittext)
        var  next = findViewById<TextView>(R.id.folllllow)

        next.setOnClickListener {
            var intent = Intent(this@MainActivity,JavaActivity::class.java)
            startActivity(intent)

        }
        filters.setOnClickListener {
            var intent = Intent(this@MainActivity,Chat_ProfileActivity::class.java)
            startActivity(intent)

        }
        btn1.setOnClickListener {
            var intent = Intent(this@MainActivity,Chat1Activity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            var intent = Intent(this@MainActivity, Chat2Activity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            var intent = Intent(this@MainActivity, Chat3Activity::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            var intent = Intent(this@MainActivity, Chat4Activity::class.java)
            startActivity(intent)
        }
        edit.setOnClickListener {
            var intent = Intent(this@MainActivity,AddImgActivity::class.java)
            startActivity(intent)
        }

//        replaceFragment(ChatFragment())
//
//        binding.bottomNavigationView.setOnItemSelectedListener {
//
//            when(it.itemId){
//
//                R.id.home -> replaceFragment(HomeFragment())
//                R.id.internet -> replaceFragment(InternetFragment())
//                R.id.favorite -> replaceFragment(FavoriteFragment())
//                R.id.chat -> replaceFragment(ChatFragment())
//
//                else ->{
//
//
//
//                }
//            }
//            true
//        }
//
//    }
//
//    private fun replaceFragment(fragment: Fragment){
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
////        fragmentTransaction.replace(R.id.frame_layout,fragment)
//        fragmentTransaction.commit()

    }
}