package com.example.flightinfo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.skyscanner.backpack.text.BpkText
import net.skyscanner.backpack.card.BpkCard
import android.widget.LinearLayout
import android.view.Gravity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Create a vertical layout
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        
        // Flight Information Card
        val flightCard = BpkCard(this).apply {
            addView(BpkText(context).apply {
                text = "Flight Number: AI-2025"
                textSize = 20f
            })
        }
        
        // Departure Card
        val departureCard = BpkCard(this).apply {
            addView(BpkText(context).apply {
                text = "Departure: JFK - 10:00 AM"
                textSize = 18f
            })
        }
        
        // Arrival Card
        val arrivalCard = BpkCard(this).apply {
            addView(BpkText(context).apply {
                text = "Arrival: LAX - 1:30 PM"
                textSize = 18f
            })
        }
        
        // Add cards to layout
        layout.addView(flightCard)
        layout.addView(departureCard)
        layout.addView(arrivalCard)
        
        setContentView(layout)
    }
}
