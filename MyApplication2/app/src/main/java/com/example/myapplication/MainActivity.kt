package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            val mess="Кнопка 1 нажата"
            Log.e("!@#",mess)

            Toast.makeText(applicationContext, mess, Toast.LENGTH_SHORT).show()

         }
        button2.setOnClickListener(){
            val mess="Кнопка 2 нажата"
            Log.e("!@#",mess)

            Toast.makeText(applicationContext, mess, Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener(){
            val mess="Кнопка 3 нажата"
            Log.e("!@#",mess)

            Toast.makeText(applicationContext, mess, Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener(){
            val mess="Кнопка 4 нажата"
            Log.e("!@#",mess)

            Toast.makeText(applicationContext, mess, Toast.LENGTH_SHORT).show()
        }

    }
}