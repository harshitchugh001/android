package com.example.classcse225

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainProgressBar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_progress_bar)
        val ProgressBarID = findViewById<ProgressBar>(R.id.ProgressBarID)
        ProgressBarID.max = 10
        val cProgressBarID = 6
        ObjectAnimator.ofInt(ProgressBarID,"progress",cProgressBarID)
            .setDuration(2000)
            .start()
    }
}