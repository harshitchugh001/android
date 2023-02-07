package com.example.classcse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class MainFooter : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_footer)
        val lvFooter = findViewById<ListView>(R.id.lvFooter)

        val mItems = arrayOf(
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")

        val mAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mItems)

        val mFooter = layoutInflater.inflate(R.layout.layout_footer, lvFooter, false) as ViewGroup

        lvFooter.addFooterView(mFooter)

        // Setting the adapter
        lvFooter.addFooterView(mFooter)

        // Setting the adapter
        lvFooter.adapter = mAdapter

    }
}


