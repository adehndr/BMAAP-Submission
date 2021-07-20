package com.example.comicdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityAbout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBarTitle()
    }

    private fun setActionBarTitle() {
        supportActionBar?.title = "About Me"
    }
}