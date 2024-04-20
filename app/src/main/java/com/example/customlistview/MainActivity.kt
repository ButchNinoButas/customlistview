package com.example.customlistview

import CustomAdapter
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView: ListView = findViewById(R.id.listView)
        val dataList = listOf(
            Triple("Noah Sebastian", "18453722", "BSIT"),
            // Add more data if needed
        )

        val adapter = CustomAdapter(this, dataList) { item ->
            // Handle item click here, navigate to next layout
            val intent = Intent(this, ProfileViews::class.java)
            // Pass data to ProfileActivity if needed
            intent.putExtra("name", item.first)
            intent.putExtra("id", item.second)
            intent.putExtra("program", item.third)
            startActivity(intent)
        }
        listView.adapter = adapter
    }
}
