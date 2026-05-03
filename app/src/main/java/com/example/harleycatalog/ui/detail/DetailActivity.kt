package com.example.harleycatalog.ui.detail

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.harleycatalog.R
import java.text.NumberFormat
import java.util.Locale

class DetailActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "42430012"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val type = intent.getStringExtra("type")
        val year = intent.getIntExtra("year", 0)
        val price = intent.getIntExtra("price", 0)
        val cc = intent.getIntExtra("engineCC", 0)
        val desc = intent.getStringExtra("description")
        val imageResId = intent.getIntExtra("imageResId", 0)

        Log.d(TAG, "DetailActivity dibuka untuk motor: $name")

        val priceFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID"))
        val formattedPrice = priceFormat.format(price)

        val imgMotorDetail = findViewById<ImageView>(R.id.imgMotorDetail)

        if (imageResId != 0) {
            imgMotorDetail.setImageResource(imageResId)
        }

        findViewById<TextView>(R.id.tvName).text = name
        findViewById<TextView>(R.id.tvType).text = "Type: $type"
        findViewById<TextView>(R.id.tvYear).text = "Year: $year"
        findViewById<TextView>(R.id.tvPrice).text = "Price: $formattedPrice"
        findViewById<TextView>(R.id.tvCC).text = "Engine CC: $cc cc"
        findViewById<TextView>(R.id.tvDesc).text = desc
    }
}