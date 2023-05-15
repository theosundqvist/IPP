package com.example.matvinn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    //private lateinit var button: Button
    //private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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