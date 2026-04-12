package com.example.harleycatalog.ui.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.harleycatalog.utils.MotorUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val motorList = MotorUtils.getMotorList()
        for (motor in motorList) {
            Log.d("42430012", motor.name)
        }
    }
}