package com.example.classcse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivityC_toolBer : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ctool_ber)
        val c_toolber = findViewById<Toolbar>(R.id.c_toolber)
        setSupportActionBar(c_toolber)

        val footer_cm = layoutInflater.inflate(R.layout.c_toolber,null,false)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.c_menu_toolber,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemview = item.itemId

        when(itemview){
            R.id.main_c -> Toast.makeText(this,"Main", Toast.LENGTH_SHORT).show()
            R.id.Search_c -> Toast.makeText(this,"Search", Toast.LENGTH_SHORT).show()
            R.id.create_c -> Toast.makeText(this,"Post", Toast.LENGTH_SHORT).show()
            R.id.add_c -> Toast.makeText(this,"Add", Toast.LENGTH_SHORT).show()
            R.id.profile_c -> Toast.makeText(this,"Profile", Toast.LENGTH_SHORT).show()
        }
        return false

    }
}