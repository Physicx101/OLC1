package com.example.olc_1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var skor = 0
        plus_button.setOnClickListener {
            imageView.visibility = View.GONE
            skor++
            Log.d("SKOR", skor.toString())
            text_skor.text = skor.toString()
            val isGenap = checkSkor(skor)
            if (isGenap) Toast.makeText(this, "Bilangan Genap", Toast.LENGTH_SHORT).show() else {
                Toast.makeText(this, "Bilangan Ganjil", Toast.LENGTH_SHORT).show()
            }
        }
        minus_button.setOnClickListener {
            imageView.visibility = View.GONE
            skor--
            Log.d("SKOR", skor.toString())
            text_skor.text = skor.toString()
            val isGenap = checkSkor(skor)
            if (isGenap) Toast.makeText(this, "Bilangan Genap", Toast.LENGTH_SHORT).show() else {
                Toast.makeText(this, "Bilangan Ganjil", Toast.LENGTH_SHORT).show()
            }
        }
        reset_button.setOnClickListener {
            skor = 0
            text_skor.text = skor.toString()
            imageView.visibility = View.VISIBLE
        }
    }


    private fun checkSkor(skor: Int): Boolean {
        return skor % 2 == 0
    }
}
