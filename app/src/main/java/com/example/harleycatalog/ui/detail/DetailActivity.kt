package com.example.harleycatalog.ui.detail

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.harleycatalog.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val type = intent.getStringExtra("type")
        val year = intent.getIntExtra("year", 0)
        val price = intent.getIntExtra("price", 0)
        val cc = intent.getIntExtra("engineCC", 0)
        val desc = intent.getStringExtra("description")

        findViewById<TextView>(R.id.tvName).text = name
        findViewById<TextView>(R.id.tvType).text = "Type: $type"
        findViewById<TextView>(R.id.tvYear).text = "Year: $year"
        findViewById<TextView>(R.id.tvPrice).text = "Price: $price"
        findViewById<TextView>(R.id.tvCC).text = "Engine CC: $cc"
        findViewById<TextView>(R.id.tvDesc).text = desc
    }
}