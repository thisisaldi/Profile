package com.thisisaldi.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.statusBarColor = ContextCompat.getColor(this, R.color.softgrey)
        val jadwalButton: Button = findViewById(R.id.jadwal_button)
        jadwalButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.jadwal_button -> {
                val jadwalIntent = Intent(this@MainActivity, JadwalActivity::class.java)
                startActivity(jadwalIntent)
            }
        }
    }


}