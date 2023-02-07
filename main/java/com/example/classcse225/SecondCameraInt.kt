package com.example.classcse225

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SecondCameraInt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_camera_int)
        val imageView2: ImageView = findViewById(R.id.imageView2)
        val bundle = intent.extras
        if (bundle != null) {
            val resId = bundle.getInt("resId")
            imageView2.setImageResource(resId)
        }
    }
}