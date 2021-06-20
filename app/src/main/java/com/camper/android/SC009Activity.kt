package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc009.*
import kotlinx.android.synthetic.main.activity_sc009.back
import kotlinx.android.synthetic.main.activity_sc009.menu
import kotlinx.android.synthetic.main.activity_sc009.search1

class SC009Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc009)

        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener {
            this.finish()
        }


        sc009_myboard.setOnClickListener {
            startActivity(Intent(this, SC013Activity::class.java))
        }

        sc009_boardwrite.setOnClickListener {
            startActivity(Intent(this, SC011Activity::class.java))
        }

        // guest 1 / host 2
        Log.d("login", App.loginFlag.toString())
        if (App.loginFlag==1)
        {
            sc009_camping.setOnClickListener {
                startActivity(Intent(this, SC016Activity::class.java))
            }
        }
        else {
            sc009_camping.setOnClickListener {
                startActivity(Intent(this, SC010Activity::class.java))
            }
        }
    }
}