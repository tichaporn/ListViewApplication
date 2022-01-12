package com.example.listviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CustomListActivity : AppCompatActivity() {

    val name = arrayOf<String>("Mickey", "Minnie")
    val id = arrayOf<String>("001", "002")
    val img = arrayOf<Int>(
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_foreground
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        val myAdapter = CustomListAdapter(this, name, id, img)
        val listview = findViewById<ListView>(R.id.custom_list_view)
        listview.adapter = myAdapter
    }
}