package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc002.*
import kotlinx.android.synthetic.main.activity_sc002.menu
import kotlinx.android.synthetic.main.activity_sc002.search1

class SC002Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc002)

        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        human_login.setColorFilter(Color.parseColor("#83787878"), PorterDuff.Mode.SRC_IN);
        key_login.setColorFilter(Color.parseColor("#83787878"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener {
            this.finish()
        }
        sc002_checkbox1.setOnClickListener {
            if(sc002_checkbox2.isChecked){
                sc002_checkbox2.isChecked = false
                sc002_checkbox1.isChecked = true
            } else {
                sc002_checkbox1.isChecked = true
            }
        }

        sc002_checkbox2.setOnClickListener {
            if(sc002_checkbox1.isChecked){
                sc002_checkbox1.isChecked = false
                sc002_checkbox2.isChecked = true
            } else {
                sc002_checkbox2.isChecked = true
            }
        }

        // login button click
        sc002_login_btn.setOnClickListener {
            val id = sc002_login.text.toString()
            val pwd = sc002_pwd.text.toString()

            if(id=="guest" && pwd=="1234" && sc002_checkbox1.isChecked){
                val loginIntent = Intent(this, SC017Activity::class.java)
                loginIntent.putExtra("id", id)
                loginIntent.putExtra("pwd", pwd)
                Log.d("test", id)

                startActivity(loginIntent)

                // 로그인 성공 시 전역 변수에 아이디 저장
                App.loginFlag = 1

            }
            else if(id=="host" && pwd=="1234" && sc002_checkbox2.isChecked)
            {
                val loginIntent = Intent(this, SC017Activity::class.java)
                loginIntent.putExtra("id", id)
                loginIntent.putExtra("pwd", pwd)
                Log.d("test", id)

                startActivity(loginIntent)

                // 로그인 성공 시 전역 변수에 아이디 저장
                App.loginFlag = 2
            }
            else{
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }

        sc002_register_btn.setOnClickListener {
            startActivity(Intent(this, SC003Activity::class.java))
        }

    }


}