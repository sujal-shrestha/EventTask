package com.example.eventcreator

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categories = arrayOf("Party", "Meeting", "Concert")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)
    }

    fun handlePickDateTime(view: View?) {
        openDatePicker()
    }
    private fun openDatePicker() {

    }
}
