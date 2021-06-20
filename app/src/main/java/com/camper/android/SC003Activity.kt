package com.camper.android

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc003.*
import kotlinx.android.synthetic.main.activity_sc003.back
import kotlinx.android.synthetic.main.activity_sc003.menu
import kotlinx.android.synthetic.main.activity_sc003.search1

class SC003Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc003)

        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener {
            this.finish()
        }

        // 고객
        sc003_checkbox1.setOnClickListener {
            if(sc003_checkbox2.isChecked){
                sc003_checkbox2.isChecked = false
                sc003_checkbox1.isChecked = true
            } else {
                sc003_checkbox1.isChecked = true
            }

            if(sc003_company.isVisible){
                sc003_company.isVisible = false
            }
        }

        // 사업자
        sc003_checkbox2.setOnClickListener {
            if(sc003_checkbox1.isChecked){
                sc003_checkbox1.isChecked = false
                sc003_checkbox2.isChecked = true
            } else {
                sc003_checkbox2.isChecked = true
            }

            if(!sc003_company.isVisible){
                sc003_company.isVisible = true
            }
        }

    }
}