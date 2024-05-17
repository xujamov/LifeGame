package com.example.game_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var button: Button
    private val imageList = arrayOf(
        R.drawable.transport_stat_modifier_1_full_size,
        R.drawable.transport_stat_modifier_2_full_size,
        R.drawable.transport_stat_modifier_3_full_size,
        R.drawable.transport_stat_modifier_4_full_size,
        R.drawable.transport_stat_modifier_5_full_size,
        R.drawable.transport_stat_modifier_6_full_size,
        R.drawable.transport_stat_modifier_7_full_size,
        R.drawable.transport_stat_modifier_8_full_size,
        R.drawable.transport_stat_modifier_9_full_size
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize views
        imageView = findViewById(R.id.imageView2)
        button = findViewById(R.id.button)

        // Set click listener for the button
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
// Change to a random image when the button is clicked
                setRandomImage()
            }
        })
    }

    private fun setRandomImage() {
        // Choose a random image from the list
        val randomImageResourceId = imageList.random()

        // Set the chosen random image to the ImageView
        imageView.setImageResource(randomImageResourceId)
    }
}