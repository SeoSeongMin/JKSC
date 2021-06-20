package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc006.*

class SC006Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc006)
        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener{
            this.finish()
        }
        sc006_camping1.setOnClickListener {
            startActivity(Intent(this,SC007Activity::class.java))
        }

    }
}