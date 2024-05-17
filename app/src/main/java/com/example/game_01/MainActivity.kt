package com.example.game_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var imageHouse: ImageView
    private lateinit var button: Button
    private lateinit var button2: Button
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
    private val imageHouses = arrayOf(
        R.drawable.accommodation_stat_modifier_1_full_size,
        R.drawable.accommodation_stat_modifier_2_full_size,
        R.drawable.accommodation_stat_modifier_3_full_size,
        R.drawable.accommodation_stat_modifier_4_full_size,
        R.drawable.accommodation_stat_modifier_5_full_size,
        R.drawable.accommodation_stat_modifier_6_full_size
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize views
        imageView = findViewById(R.id.imageView2)
        imageHouse = findViewById(R.id.imageHouse)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)


        // Set click listener for the button
        button.setOnClickListener {
            // Set a random image
            setRandomImage()
        }
        button2.setOnClickListener {
            // Set a random image
            setRandomImage2()
        }
    }

    private fun setRandomImage() {
        val randomImageResourceId = imageList.random()
        imageView.setImageResource(randomImageResourceId)
    }

    private fun setRandomImage2() {
        val randomImageResourceId = imageHouses.random()
        imageHouse.setImageResource(randomImageResourceId)
    }
}