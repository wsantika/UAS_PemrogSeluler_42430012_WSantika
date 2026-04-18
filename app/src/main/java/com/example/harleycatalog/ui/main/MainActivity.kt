package com.example.harleycatalog.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harleycatalog.R
import com.example.harleycatalog.adapter.MotorAdapter
import com.example.harleycatalog.utils.MotorUtils
import android.content.Intent
import android.widget.Button
import com.example.harleycatalog.ui.form.FormActivity
import com.example.harleycatalog.ui.detail.DetailActivity

class MainActivity : AppCompatActivity() {

    private lateinit var rvMotor: RecyclerView
    private lateinit var adapter: MotorAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMotor = findViewById(R.id.rvMotor)

        val motorList = MotorUtils.getMotorList()

        adapter = MotorAdapter(motorList) { motor ->
            val intent = Intent(this, DetailActivity::class.java)

            intent.putExtra("name", motor.name)
            intent.putExtra("type", motor.type)
            intent.putExtra("year", motor.year)
            intent.putExtra("price", motor.price)
            intent.putExtra("engineCC", motor.engineCC)
            intent.putExtra("description", motor.description)

            startActivity(intent)
        }

        rvMotor.layoutManager = LinearLayoutManager(this)
        rvMotor.adapter = adapter



        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }
    }

}