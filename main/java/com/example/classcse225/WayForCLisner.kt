package com.example.classcse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class WayForCLisner : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_way_for_clisner)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)

    }
//    button5.setOnclickListener(::onButtonClicked)
//    override fun onClick(v:View?){
//        when(p0?.id){
//            R.id.button5 ->Toast.makeText(this,"btn 1",Toast.LENGTH_SHORT).show()
//            else->Toast.makeText(this," null",Toast.LENGTH_SHORT).show()
//        }
//    }
}