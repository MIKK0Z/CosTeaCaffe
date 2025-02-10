package com.example.costeacaffe

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.costeacaffe.SnackType
import com.google.gson.Gson
import java.io.InputStreamReader

class SnackCategoryActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_category_activty)

        val fileStream = this.assets.open("snacks.json")
        val reader = InputStreamReader(fileStream)
        val snacks = Gson().fromJson(reader, Array<SnackType>::class.java)





    }
}