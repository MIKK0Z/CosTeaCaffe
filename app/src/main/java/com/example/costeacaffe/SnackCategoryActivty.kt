package com.example.costeacaffe

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader

class SnackCategoryActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_category_activty)

//        val fileStream = this.assets.open("snacks.json")
//        val reader = InputStreamReader(fileStream)
//        val snacks = Gson().fromJson(reader, Array<SnackType>::class.java)
        val snacksString = readFile(baseContext, "snacks.json")





    }
}

fun readFile(context: Context, path: String): String {
    try {
        val file = context.assets.open(path);
        val bufferedReader = BufferedReader(InputStreamReader(file));
        val stringBuilder = StringBuilder();
        bufferedReader.useLines { lines ->
            lines.forEach { stringBuilder.append(it) };
        };

        return stringBuilder.toString();
    } catch (err: Exception) {
        Log.e("file reader", "error when reading file $path: $err");
        return "";
    }
}