package com.example.matvinn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SearchView

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    //private lateinit var button: Button
    //private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val searchView = findViewById<SearchView>(R.id.searchView)

        val buttonOpenNewActivity = findViewById<Button>(R.id.button)
        buttonOpenNewActivity.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val buttonOpenNewActivity2 = findViewById<Button>(R.id.button2)
        buttonOpenNewActivity2.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
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


        /*
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)

        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.i(TAG, "Knapp tryckt")
            }

        })*/
    }
}