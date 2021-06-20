package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc001.*
import kotlinx.android.synthetic.main.activity_sc001.menu
import kotlinx.android.synthetic.main.activity_sc001.search1
import kotlinx.android.synthetic.main.activity_sc001.search2


class SC001Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc001)

        human.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search2.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);


        sc001_login.setOnClickListener {
            startActivity(Intent(this, SC002Activity::class.java))
        }

        sc001_search.setOnClickListener {
            startActivity(Intent(this, SC005Activity::class.java))

        }

        sc001_community.setOnClickListener {
            startActivity(Intent(this, SC009Activity::class.java))
        }

        sc001_camping.setOnClickListener {
            startActivity(Intent(this, SC010Activity::class.java))
        }


    }
}