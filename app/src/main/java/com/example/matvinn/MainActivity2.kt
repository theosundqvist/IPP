package com.example.matvinn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.SearchView

class MainActivity2 : AppCompatActivity() {

    private lateinit var searchView: SearchView
    private lateinit var cameraButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        searchView = findViewById(R.id.searchView)
        cameraButton = findViewById(R.id.camera_button)

        cameraButton.setOnClickListener {
            openCamera()
        }
    }

    private fun openCamera() {
        // Add the code to open the camera here
    }

    // Other methods and code for your activity

}
