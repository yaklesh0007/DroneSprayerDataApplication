package com.example.androiddroneapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import com.example.androiddroneapplication.R

class SplashActivity : AppCompatActivity() {
    private lateinit var imagelogo: ImageView
    private lateinit var progressbar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        imagelogo=findViewById(R.id.imagelogo)
        progressbar=findViewById(R.id.progressbar)

//        CoroutineScope(Dispatchers.IO).launch{
//            delay(1000)
//            startActivity(Intent(this, LoginActivity::class.java))
//            finish()
//        }
    }
}