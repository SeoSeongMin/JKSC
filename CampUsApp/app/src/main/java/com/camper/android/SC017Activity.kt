package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camper.anroid.R

import kotlinx.android.synthetic.main.activity_sc017.*

class SC017Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc017)

        human.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search2.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);


        sc017_search.setOnClickListener {
            startActivity(Intent(this, SC005Activity::class.java))

        }
        sc017_community.setOnClickListener {
            startActivity(Intent(this, SC009Activity::class.java))
        }

        sc017_logout.setOnClickListener {
            App.loginFlag = 0
            startActivity(Intent(this, SC001Activity::class.java))
        }

        // guest/host 분기
        if (App.loginFlag==1)
        {
            sc017_camping.setOnClickListener {
                startActivity(Intent(this, SC016Activity::class.java))
            }
            sc017_mypage.setOnClickListener {
                startActivity(Intent(this, SC018Activity::class.java))
            }
        }
        else {
            sc017_camping.setOnClickListener {
                startActivity(Intent(this, SC010Activity::class.java))
            }
            sc017_mypage.setOnClickListener {
                startActivity(Intent(this, SC019Activity::class.java))
            }
        }

    }
}