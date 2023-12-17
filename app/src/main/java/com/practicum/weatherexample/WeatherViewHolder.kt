package com.practicum.weatherexample

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class WeatherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val timeView = itemView.findViewById<TextView>(R.id.time)
    private val iconView = itemView.findViewById<ImageView>(R.id.weather_icon)
    private val temperatureView = itemView.findViewById<TextView>(R.id.temperature)
    private val humidityView = itemView.findViewById<TextView>(R.id.humidity)
    private val container = itemView.findViewById<ConstraintLayout>(R.id.container)

    fun bind(model: Weather) {
        if (model.temperature < 10) {
            container.setBackgroundColor(ContextCompat.getColor(itemView.context, R.color.color))
        }
        timeView.text = model.time
        iconView.setImageResource(model.icon)
        temperatureView.text = model.temperature.toString()
        humidityView.text = model.humidity
    }
}