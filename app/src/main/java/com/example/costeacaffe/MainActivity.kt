package com.example.costeacaffe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log
import android.widget.ListView;
import androidx.activity.enableEdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

class MainActivity : AppCompatActivity() {
    private lateinit var listCategories: ListView;

    private fun startNewActivity(activityClass: Class<out AppCompatActivity>) {
        val intent = Intent(this, activityClass);
        startActivity(intent);
    };

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        enableEdgeToEdge();
        setContentView(R.layout.activity_main);

        listCategories = findViewById(R.id.list_categories);
        listCategories.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> startNewActivity(DrinkCategoryActivity::class.java);
                1 -> startNewActivity(SnackCategoryActivty::class.java);
                2 -> startNewActivity(LocalCategoryActivity::class.java);
            };
        };
    };
};