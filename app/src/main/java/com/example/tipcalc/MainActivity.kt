package com.example.tipcalc

import android.app.Activity
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipPercent = tipPercentEditText.text.toString().toDouble()
            val tip = bill * tipPercent/100
            val total = bill + tip

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: \$" + tip+" Total:\$"+total

        }

    }

}
