package com.example.aferilapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var inputAngka1: Int? = null
    var inputAngka2: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputAngka1 = findViewById<EditText>(R.id.inputAngka1)
        val inputAngka2 = findViewById<EditText>(R.id.inputAngka2)
        val btnKali = findViewById<Button>(R.id.btnKali)
        val btnBagi = findViewById<Button>(R.id.btnBagi)
        val btnTambah = findViewById<Button>(R.id.btnTambah)
        val btnKurang = findViewById<Button>(R.id.btnKurang)
        val btnModulus = findViewById<Button>(R.id.btnModulus)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val hasil = findViewById<TextView>(R.id.hasil)


        btnKali.setOnClickListener {
            val inputAngka1 = inputAngka1.getText().toString().toInt()
            val inputAngka2 = inputAngka2.getText().toString().toInt()

            val hasilHitung = inputAngka1 * inputAngka2
            hasil.setText("$inputAngka1 dikalikan dengan $inputAngka2 adalah $hasilHitung")
        }

        btnBagi.setOnClickListener {
            val inputAngka1 = inputAngka1.getText().toString().toInt()
            val inputAngka2 = inputAngka2.getText().toString().toInt()

            val hasilHitung = inputAngka1 / inputAngka2
            hasil.setText("$inputAngka1 dibagi dengan $inputAngka2 adalah $hasilHitung")
        }

        btnTambah.setOnClickListener {
            val inputAngka1 = inputAngka1.getText().toString().toInt()
            val inputAngka2 = inputAngka2.getText().toString().toInt()

            val hasilHitung = inputAngka1 + inputAngka2
            hasil.setText("$inputAngka1 ditambahkan dengan $inputAngka2 adalah $hasilHitung")
        }

        btnKurang.setOnClickListener {
            val inputAngka1 = inputAngka1.getText().toString().toInt()
            val inputAngka2 = inputAngka2.getText().toString().toInt()

            val hasilHitung = inputAngka1 - inputAngka2
            hasil.setText("$inputAngka1 dikurangi dengan $inputAngka2 adalah $hasilHitung")
        }

        btnModulus.setOnClickListener {
            val inputAngka1 = inputAngka1.getText().toString().toInt()
            val inputAngka2 = inputAngka2.getText().toString().toInt()

            val hasilHitung = inputAngka1 % inputAngka2
            hasil.setText("$inputAngka1 dimoduluskan dengan $inputAngka2 adalah $hasilHitung")
        }

        btnClear.setOnClickListener {
            val randomInt = (0)
            val inputAngka1: TextView = findViewById(R.id.inputAngka1)
            inputAngka1.text = randomInt.toString()
            val inputAngka2: TextView = findViewById(R.id.inputAngka2)
            inputAngka2.text = randomInt.toString()
        }
    }
}