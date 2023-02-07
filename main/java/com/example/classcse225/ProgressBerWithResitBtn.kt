package com.example.classcse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class ProgressBerWithResitBtn : AppCompatActivity() {

    private var progressBarStatus = 0
    var dummy:Int = 0
    var secondaryHandler: Handler? = Handler()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_ber_with_resit_btn)

        val btnProgBer = findViewById<Button>(R.id.btnProgBer)
        val btnProgBer2 = findViewById<Button>(R.id.btnProgBer2)
        val ProgBer = findViewById<ProgressBar>(R.id.ProgBer)
        val ProgBer2 = findViewById<ProgressBar>(R.id.ProgBer2)
        var tvProgBer = findViewById<TextView>(R.id.tvProgBer)
        val btnProgBerStop = findViewById<Button>(R.id.btnProgBerStop)
        if(progressBarStatus == 0){
            ProgBer2.visibility = View.INVISIBLE
        }
        btnProgBer.setOnClickListener(){
            ProgBer2.visibility = View.VISIBLE
            Thread(Runnable {
                // dummy thread mimicking some operation whose progress can be tracked
                var x = 100
                while (progressBarStatus < x) {

                    // performing some dummy operation
                    try {
                        dummy = dummy+1

                        Thread.sleep(100)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                    // tracking progress

                    secondaryHandler?.post {
                        tvProgBer.text = "Complete $dummy% of 100"

                        if (dummy == 100) {
                            ProgBer2.visibility = View.INVISIBLE
                            tvProgBer.text = "All tasks completed"
                        }
                    }
                    btnProgBerStop.setOnClickListener{
                        x=progressBarStatus
                        ProgBer2.visibility = View.INVISIBLE
                    }
                    progressBarStatus = dummy

                    // Updating the progress bar
                    ProgBer.progress = progressBarStatus
                }

            }).start()

        }

        btnProgBer2.setOnClickListener{
            progressBarStatus = 0
            dummy = 0
            ProgBer.progress = 0
            tvProgBer.text = "Complete $dummy% of 100"
        }
    }
}