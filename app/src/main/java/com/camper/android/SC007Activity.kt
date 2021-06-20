package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc007.*

class SC007Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc007)

        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);


        val spinner1: Spinner = findViewById(R.id.rooms_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.rooms_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner1.adapter = adapter
        }

        val spinner2: Spinner = findViewById(R.id.checkin_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.checkin_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter
        }

        val spinner3: Spinner = findViewById(R.id.checkout_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.checkout_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner3.adapter = adapter
        }

        val spinner4: Spinner = findViewById(R.id.adults_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.adults_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner4.adapter = adapter
        }

        val spinner5: Spinner = findViewById(R.id.child_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.child_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner5.adapter = adapter
        }

        sc007_reservation.setOnClickListener {
            startActivity(Intent(this,SC008Activity::class.java))
        }

    }
}