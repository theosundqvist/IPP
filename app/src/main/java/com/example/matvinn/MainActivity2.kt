package com.example.matvinn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String): Boolean {
            // Perform search or filtering logic here
            return true
        }

        override fun onQueryTextChange(newText: String): Boolean {
            // Perform search or filtering logic as the query text changes
            return true
        }
    })

}