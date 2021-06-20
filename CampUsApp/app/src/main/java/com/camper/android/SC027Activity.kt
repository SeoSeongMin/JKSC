package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc027.*
import kotlinx.android.synthetic.main.activity_sc027.back
import kotlinx.android.synthetic.main.activity_sc027.menu
import kotlinx.android.synthetic.main.activity_sc027.search1

class SC027Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc027)

        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener {
            this.finish()
        }

        sc027_finish.setOnClickListener {
            startActivity(Intent(this, SC019Activity::class.java))
        }

        sc027_cancel.setOnClickListener {
            this.finish()
        }

    }
}