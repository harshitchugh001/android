package com.example.classcse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainRatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_rating_bar)

        val btnRatingBar2 = findViewById<RatingBar>(R.id.btnRatingBar2)
        val btnRatingBar = findViewById<RatingBar>(R.id.BtnRatingBar)
        val btnRating = findViewById<Button>(R.id.button2)
        val tvRatingBar = findViewById<TextView>(R.id.tvRatingBar)

        btnRating.setOnClickListener{
            val msg = btnRatingBar2.rating.toString()
            Toast.makeText(this,
                "Rating is: "+msg, Toast.LENGTH_SHORT).show()

        }

        btnRatingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
            Toast.makeText(this,"Rating is: "+btnRatingBar.rating, Toast.LENGTH_SHORT).show()
            tvRatingBar.text = btnRatingBar.rating.toString()
        }



    }
}