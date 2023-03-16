package com.heavysmoker.plzsavemoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_RadioGroup_Month.setOnCheckedChangeListener { main_RadioGroup_Month, checkedId ->
            when (checkedId) {
                R.id.main_radioButton_thisMonth -> {
                    main_UsedMoney_text.text = "100,000,000원"
                    nextMonthText.visibility = View.INVISIBLE
                }
                R.id.main_radioButton_nextMonth -> {
                    main_UsedMoney_text.text = "50,000원"
                    nextMonthText.visibility = View.VISIBLE
                }
            }
        }
        main_radioButton_thisMonth.isChecked = true
        Log.d("fuckme","Create!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("fuckme","Resume!")
    }

    fun setView(text: String, visbilty: Boolean) {
        main_UsedMoney_text.text = text
        nextMonthText.visibility = if(visbilty) { View.VISIBLE } else { View.INVISIBLE }
    }
}