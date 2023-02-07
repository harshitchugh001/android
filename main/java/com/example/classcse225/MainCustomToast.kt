package com.example.classcse225


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast




class MainCustomToast : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_custom_toast)

        val btnCustomXml = findViewById<Button>(R.id.btnCustomXml)
        btnCustomXml.setOnClickListener(){
            val vg:ViewGroup? = findViewById(R.id.linearLayout)
            val inflater = layoutInflater

            val layout : View = inflater.inflate(R.layout.custom_toast,vg)

            val tv = layout.findViewById<TextView>(R.id.custom_toast_message)

            tv.text = "Custom Tost"

            val toast = Toast(applicationContext)

            toast.setGravity(Gravity.CENTER_VERTICAL,0,100)
            toast.setView(layout)
            toast.show()
        }

    }
}