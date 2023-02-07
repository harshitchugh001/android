package com.example.classcse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainToolBer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tool_ber)

        var tool = findViewById<Toolbar>(R.id.toolberMain)
        setSupportActionBar(tool)
        tool.setNavigationOnClickListener(){
            Toast.makeText(this,"Clicked Toolber", Toast.LENGTH_SHORT).show()
        }
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