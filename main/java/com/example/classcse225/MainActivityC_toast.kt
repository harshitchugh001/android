package com.example.classcse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class MainActivityC_toast : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ctoast)
        val btn_custom_toast_2 = findViewById<Button>(R.id.btn_custom_toast_2)
        val c_lin: ViewGroup? = findViewById(R.id.c_lin)
        val layout = layoutInflater.inflate(R.layout.c_toast,c_lin)
        btn_custom_toast_2.setOnClickListener(){
            val myToast = Toast(applicationContext)
            myToast.duration = Toast.LENGTH_LONG
            myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            myToast.view = layout//setting the view of custom toast layout

            myToast.show()
        }
    }
}