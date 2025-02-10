package com.example.costeacaffe

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DrinkActivity : AppCompatActivity() {
    private lateinit var drinkName: TextView
    private lateinit var drinkDescription: TextView
    private lateinit var drinkImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_drink)

        drinkName = findViewById(R.id.drink_name)
        drinkDescription = findViewById(R.id.drink_description)
        drinkImage = findViewById(R.id.drink_image)

        val drinkID = intent.getIntExtra("drinkID", -1)
        val drink = Drink.drinks[drinkID]

        drinkName.text = drink.name
        drinkDescription.text = drink.description
        drinkImage.setImageResource(drink.imageResourceId)
    }
}