package com.playlab.androidlab.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.playlab.androidlab.R

class ViewpagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)

        supportActionBar?.hide()
    }
}