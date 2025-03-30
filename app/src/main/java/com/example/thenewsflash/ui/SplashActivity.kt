package com.example.thenewsflash.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.newsprojectpractice.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Espera 3 segundos y luego pasa a NewsActivity
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, NewsActivity::class.java))
            finish()
        }, 3000)
    }
}
