package com.example.classcse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class AvRatingBar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_av_rating_bar)
        val RatingVa1 =findViewById<RatingBar>(R.id.RatingVa1)
        val RatingVa2 =findViewById<RatingBar>(R.id.RatingVa2)
        val RatingVa3 =findViewById<RatingBar>(R.id.RatingVa3)
        val RatingVa4 =findViewById<RatingBar>(R.id.RatingVa4)
        val RatingVa5 =findViewById<RatingBar>(R.id.RatingVa5)
        val btnVaRating = findViewById<Button>(R.id.btnVaRating)
        val tvRatingBar = findViewById<TextView>(R.id.tvVaRating)

        btnVaRating.setOnClickListener{
            var sum  = RatingVa1.rating.toFloat() + RatingVa2.rating.toFloat() +RatingVa3.rating.toFloat() +RatingVa4.rating.toFloat() +RatingVa5.rating.toFloat();
            tvRatingBar.text = (sum/5).toString();
        }
    }
}