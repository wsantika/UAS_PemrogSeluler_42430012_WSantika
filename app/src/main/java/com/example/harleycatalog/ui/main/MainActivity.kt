package com.example.harleycatalog.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harleycatalog.R
import com.example.harleycatalog.adapter.MotorAdapter
import com.example.harleycatalog.utils.MotorUtils

class MainActivity : AppCompatActivity() {

    private lateinit var rvMotor: RecyclerView
    private lateinit var adapter: MotorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMotor = findViewById(R.id.rvMotor)

        val motorList = MotorUtils.getMotorList()

        adapter = MotorAdapter(motorList)

        rvMotor.layoutManager = LinearLayoutManager(this)
        rvMotor.adapter = adapter
    }
}