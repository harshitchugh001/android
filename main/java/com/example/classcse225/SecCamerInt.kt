package com.example.classcse225

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SecCamerInt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec_camer_int)

        val btnImage = findViewById<Button>(R.id.camera_button)
//        val btnImage1 = findViewById<Button>(R.id.camera_button)
        btnImage.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                startActivityForResult(it, 0)
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val ivPhoto = findViewById<ImageView>(R.id.click_image)

        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
            val url = data?.data
            ivPhoto.setImageURI(url)
            
        }
    }
}