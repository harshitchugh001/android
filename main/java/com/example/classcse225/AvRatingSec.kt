package com.example.classcse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class AvRatingSec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_av_rating_sec)

        val R61 = findViewById<RatingBar>(R.id.R1)
        val RatingVa22 = findViewById<RatingBar>(R.id.R2)
        val RatingVa33 = findViewById<RatingBar>(R.id.R3)
        val RatingVa44 = findViewById<RatingBar>(R.id.R4)
        val RatingVa55 = findViewById<RatingBar>(R.id.R5)
        val RatingVa11 = findViewById<RatingBar>(R.id.R6)
        val tvRatingBar = findViewById<TextView>(R.id.tvR1)

        var arr = arrayOf(0.0,0.0,0.0,0.0,0.0)
        RatingVa11.setOnRatingBarChangeListener { ratingBar, fl, b ->
            arr.set(0,RatingVa11.rating.toDouble())
            R61.rating = (arr.sum()/5).toFloat()
            tvRatingBar.text = (arr.sum()/5).toString();
        }
        RatingVa22.setOnRatingBarChangeListener { ratingBar, fl, b ->
            arr.set(1,RatingVa22.rating.toDouble())
            R61.rating = (arr.sum()/5).toFloat()
            tvRatingBar.text = (arr.sum()/5).toString();
        }
        RatingVa33.setOnRatingBarChangeListener { ratingBar, fl, b ->
            arr.set(2,RatingVa33.rating.toDouble())
            R61.rating = (arr.sum()/5).toFloat()
            tvRatingBar.text = (arr.sum()/5).toString();
        }
        RatingVa44.setOnRatingBarChangeListener { ratingBar, fl, b ->
            arr.set(3,RatingVa44.rating.toDouble())
            R61.rating = (arr.sum()/5).toFloat()
            tvRatingBar.text = (arr.sum()/5).toString();
        }
        RatingVa55.setOnRatingBarChangeListener { ratingBar, fl, b ->
            arr.set(4,RatingVa55.rating.toDouble())
//            R61.rating = (arr.sum()/5).toFloat()
            tvRatingBar.text = (arr.sum()/5).toString();
        }

    }
}