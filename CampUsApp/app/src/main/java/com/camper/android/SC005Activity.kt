package com.camper.android

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import com.camper.anroid.R
import kotlinx.android.synthetic.main.activity_sc003.*
import kotlinx.android.synthetic.main.activity_sc005.*
import kotlinx.android.synthetic.main.activity_sc005.back
import kotlinx.android.synthetic.main.activity_sc005.menu
import kotlinx.android.synthetic.main.activity_sc005.search1
import kotlinx.android.synthetic.main.activity_sc006.*


class SC005Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sc005)
        back.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        menu.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        search1.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
        sc005_search2.setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);

        back.setOnClickListener {
            this.finish()
        }

        sc005_date.setOnClickListener {
            showDatePicker(it)
        }

        sc005_search2.setOnClickListener{
            startActivity(Intent(this, SC006Activity::class.java))
        }

        val spinner: Spinner = findViewById(R.id.pay_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.pay_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }


    private fun showDatePicker(view: View?) {
        val newFragment: DialogFragment = com.camper.DatePickerFragment()
        newFragment.show(supportFragmentManager, "datePicker")
    }

    fun processDatePickerResult(year: Int, month: Int, day: Int) {
        val month = (month + 1).toString()
        val day = day.toString()
        val year= year.toString()
        val dateMessage = "$month/$day/$year"
        Toast.makeText(this, "Date: $dateMessage", Toast.LENGTH_SHORT).show()
    }


}