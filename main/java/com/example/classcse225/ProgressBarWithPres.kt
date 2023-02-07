package com.example.classcse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class ProgressBarWithPres : AppCompatActivity() {

    private var progressBarStatus = 0
    var dummy:Int = 0
    var secondaryHandler: Handler? = Handler()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_with_pres)

        val btnPrograessBerPre = findViewById<Button>(R.id.btnPrograessBerPre)
        val PrograessBerPre = findViewById<ProgressBar>(R.id.PrograessBerPre)
        var tvPrograessBerPre = findViewById<TextView>(R.id.tvPrograessBerPre)
        btnPrograessBerPre.setOnClickListener(){
            Thread(Runnable {
                // dummy thread mimicking some operation whose progress can be tracked
                while (progressBarStatus < 100) {
                    // performing some dummy operation
                    try {
                        dummy = dummy+1

                        Thread.sleep(100)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                    // tracking progress

                    secondaryHandler?.post {
                        tvPrograessBerPre.text = "Complete $dummy% of 100"

                        if (dummy == 100) {
                            tvPrograessBerPre.text = "All tasks completed"
                        }
                    }
                    progressBarStatus = dummy

                    // Updating the progress bar
                    PrograessBerPre.progress = progressBarStatus
                }

            }).start()


        }


    }
}