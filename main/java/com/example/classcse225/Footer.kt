@file:Suppress("DEPRECATION")

package com.example.classcse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class Footer : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_footer)
        val c_fter = findViewById<BottomNavigationView>(R.id.c_fter)
        var tool = findViewById<Toolbar>(R.id.toolberMain2)
        setSupportActionBar(tool)
        tool.setNavigationOnClickListener(){
            Toast.makeText(this,"Clicked Toolber", Toast.LENGTH_SHORT).show()
        }


        c_fter.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.Search_c -> {
                    setContent("Home")
                    true
                }
                R.id.Search_c -> {
                    setContent("Search")

                    true
                }
                R.id.create_c -> {
                    setContent("Create")

                    true
                }
                R.id.add_c -> {
                    setContent("Add")
                   true
                }
                R.id.profile_c -> {
                    setContent("Profile")
                    true
                }
                else-> false

            }
        }
    }
    private fun setContent(content: String) {
        setTitle(content)
        Toast.makeText(this,content, Toast.LENGTH_SHORT).show()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu,menu)
        return true

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemview = item.itemId

        when(itemview){
            R.id.add -> Toast.makeText(this,"Add Photo",Toast.LENGTH_SHORT).show()
            R.id.Search -> Toast.makeText(this,"Search Photo",Toast.LENGTH_SHORT).show()
            R.id.delete -> Toast.makeText(this,"Delete Photo",Toast.LENGTH_SHORT).show()
        }
        return false
    }
}