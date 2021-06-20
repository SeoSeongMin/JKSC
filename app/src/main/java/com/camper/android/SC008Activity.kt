package com.camper.android

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc008.*

class SC008Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc008)
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);


    }
}