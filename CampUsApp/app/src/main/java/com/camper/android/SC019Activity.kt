package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc019.*

class SC019Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc019)

        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener {
            this.finish()
        }

        sc019_reservation_list.setOnClickListener {
            startActivity(Intent(this, SC024Activity::class.java))
        }

        sc019reservation_camping.setOnClickListener {
            startActivity(Intent(this, SC026Activity::class.java))
        }
        
    }
}