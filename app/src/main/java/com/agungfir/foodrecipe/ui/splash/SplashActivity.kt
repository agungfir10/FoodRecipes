package com.agungfir.foodrecipe.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.agungfir.foodrecipe.MainActivity
import com.agungfir.foodrecipe.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(mainLooper).postDelayed(
            {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            },
            2000
        )
    }
}