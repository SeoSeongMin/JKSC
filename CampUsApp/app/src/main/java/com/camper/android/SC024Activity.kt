package com.camper.android

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc024.*


class SC024Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc024)

        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener {
            this.finish()
        }
        val spinner: Spinner = findViewById(R.id.sort_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.sort_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }
}