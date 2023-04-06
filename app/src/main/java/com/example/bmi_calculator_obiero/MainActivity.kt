package com.example.bmi_calculator_obiero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display: TextView
    private lateinit var edtHeight: EditText
    private lateinit var edtWeight: EditText
    private lateinit var buttonBMI: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtHeight = findViewById(R.id.edt_height)
        edtWeight = findViewById(R.id.edt_weight)
        display = findViewById(R.id.txt_result)
        buttonBMI = findViewById(R.id.btn_BMI)


        buttonBMI.setOnClickListener {
            var height = edtHeight.text.toString().trim()
            var weight = edtWeight.text.toString().trim()

            if (height.isEmpty() || weight.isEmpty()) {

                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
            }
            else {

                var result = (weight.toDouble()) / (height.toDouble() * height.toDouble())
                display.text = result.toString()
            }
        }

    }
}