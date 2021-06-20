package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc011.*

class SC011Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc011)

        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener {
            this.finish()
        }

        sc011_save.setOnClickListener {
            startActivity(Intent(this, SC009Activity::class.java))
        }
// 첨부파일 안됨
//        sc011_fileupload.setOnClickListener{
//            val intent = Intent(Intent.ACTION_GET_CONTENT)
//            intent.type = "*/*"
//            startActivityIfNeeded(intent, 10)
//        }
    }
}