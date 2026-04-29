package com.example.harleycatalog.ui.form

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.harleycatalog.R
import android.widget.EditText
import android.widget.Button
import android.widget.Toast
import android.util.Log

class FormActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "42430012"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        Log.d(TAG, "FormActivity dibuka")
        val etName = findViewById<EditText>(R.id.etName)
        val etType = findViewById<EditText>(R.id.etType)
        val etYear = findViewById<EditText>(R.id.etYear)
        val etPrice = findViewById<EditText>(R.id.etPrice)
        val etCC = findViewById<EditText>(R.id.etCC)
        val etDesc = findViewById<EditText>(R.id.etDesc)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {

            Log.d(TAG, "Tombol simpan ditekan")
            val name = etName.text.toString().trim()
            val type = etType.text.toString().trim()
            val yearText = etYear.text.toString().trim()
            val priceText = etPrice.text.toString().trim()
            val ccText = etCC.text.toString().trim()
            val desc = etDesc.text.toString().trim()

            // VALIDASI
            if (name.isEmpty()) {
                etName.error = "Nama tidak boleh kosong"
                return@setOnClickListener
            }

            if (type.isEmpty()) {
                etType.error = "Tipe tidak boleh kosong"
                return@setOnClickListener
            }

            if (yearText.isEmpty()) {
                etYear.error = "Tahun tidak boleh kosong"
                return@setOnClickListener
            }

            if (priceText.isEmpty()) {
                etPrice.error = "Harga tidak boleh kosong"
                return@setOnClickListener
            }

            if (ccText.isEmpty()) {
                etCC.error = "CC tidak boleh kosong"
                return@setOnClickListener
            }

            if (desc.isEmpty()) {
                etDesc.error = "Deskripsi tidak boleh kosong"
                return@setOnClickListener
            }

            // TRY-CATCH ERROR HANDLING
            try {
                val year = yearText.toInt()
                val price = priceText.toInt()
                val cc = ccText.toInt()

                Log.d(TAG, "Input berhasil dikonversi: year=$year, price=$price, cc=$cc")

                Toast.makeText(
                    this,
                    "Data berhasil divalidasi!",
                    Toast.LENGTH_SHORT
                ).show()

            } catch (e: NumberFormatException) {
                Toast.makeText(
                    this,
                    "Tahun, harga, dan CC harus berupa angka yang valid",
                    Toast.LENGTH_SHORT
                ).show()

            } catch (e: Exception) {
                Toast.makeText(
                    this,
                    "Terjadi kesalahan: ${e.message}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}