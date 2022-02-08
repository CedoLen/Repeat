package com.example.apprepit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.apprepit.Adepters.vpAdepter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val VP = findViewById<ViewPager>(R.id.myVP)
        VP.adapter = vpAdepter(supportFragmentManager)
    }
}