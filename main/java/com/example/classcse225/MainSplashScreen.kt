package com.example.classcse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainSplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed(Runnable
        { //This method will be executed once the timer is over
            // Start your app main activity
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            // close this activity
            finish()
        }, 5000)

//        val handler =   Handler(Looper.getMainLooper())
//       handler.postDelayed(Runa{
//           val intent = Intent(this, MainActivity::class.java)
//           startActivity(intent)
//           finish()
//       },3000)

    }
}