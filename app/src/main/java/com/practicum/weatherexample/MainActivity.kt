package com.practicum.weatherexample

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val weatherList =
            listOf(
                Weather("1:00", R.drawable.moon, 10, "10%"),
                Weather("2:00", R.drawable.moon, 11, "10%"),
                Weather("3:00", R.drawable.moon, 11, "10%"),
                Weather("4:00", R.drawable.moon, 9, "10%"),
                Weather("5:00", R.drawable.moon, 8, "10%"),
                Weather("6:00", R.drawable.sunset, 9, "10%"),
                Weather("7:00", R.drawable.sunset, 10, "15%"),
                Weather("8:00", R.drawable.sun, 11, "15%"),
                Weather("9:00", R.drawable.sun, 13, "15%"),
                Weather("10:00", R.drawable.sun, 15, "20%"),
                Weather("11:00", R.drawable.sun, 17, "20%"),
                Weather("12:00", R.drawable.sun, 25, "30%"),
                Weather("13:00", R.drawable.sun, 25, "30%"),
                Weather("9:00", R.drawable.sun, 15, "10%"),
                Weather("9:00", R.drawable.sun, 20, "10%"),
                Weather("9:00", R.drawable.sun, 50, "10%"),
                Weather("9:00", R.drawable.sun, 5, "10%")

                )

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        val weatherAdapter = WeatherAdapter(weatherList)
        recycler.adapter = weatherAdapter
    }
}