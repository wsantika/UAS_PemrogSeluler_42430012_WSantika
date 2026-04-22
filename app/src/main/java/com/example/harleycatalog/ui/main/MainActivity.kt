package com.example.harleycatalog.ui.main

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.harleycatalog.R
import com.example.harleycatalog.adapter.MotorAdapter
import com.example.harleycatalog.model.Motor
import com.example.harleycatalog.ui.detail.DetailActivity
import com.example.harleycatalog.ui.form.FormActivity
import com.example.harleycatalog.utils.MotorUtils

class MainActivity : AppCompatActivity() {

    private lateinit var rvMotor: RecyclerView
    private lateinit var adapter: MotorAdapter
    private lateinit var motorList: ArrayList<Motor>
    private lateinit var filteredList: ArrayList<Motor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMotor = findViewById(R.id.rvMotor)
        val etSearch = findViewById<EditText>(R.id.etSearch)
        val btnAdd = findViewById<Button>(R.id.btnAdd)

        motorList = MotorUtils.getMotorList()
        filteredList = ArrayList(motorList)

        adapter = MotorAdapter(filteredList) { motor ->
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

        etSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val keyword = s.toString().lowercase()

                filteredList.clear()

                for (motor in motorList) {
                    if (motor.name.lowercase().contains(keyword)) {
                        filteredList.add(motor)
                    }
                }

                adapter.notifyDataSetChanged()
            }
        })

        btnAdd.setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }
    }
}