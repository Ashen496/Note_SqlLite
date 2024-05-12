package com.example.notesqllite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)

        supportActionBar?.hide()

        Handler().postDelayed({
                              val intent = Intent(this@LaunchScreen,MainActivity::class.java)
                              startActivity(intent)
        },3000)
    }
}