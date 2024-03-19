package com.example.multiplicationtables

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(

) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val tableNumberEditText= findViewById<EditText>(R.id.tableNumberEditText)

        btnMultiply.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, MultiplicationTable::class.java)
            // add the table number to the intent
            intent.putExtra("tableNumber",tableNumberEditText.text.toString())

            // start the activity
            startActivity(intent)

        }
    }
}