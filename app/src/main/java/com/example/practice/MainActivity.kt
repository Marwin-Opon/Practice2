package com.example.practice

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.btnCompute)
        val txtMath:EditText = findViewById(R.id.txtMath)
        val txtScience:EditText = findViewById(R.id.txtScience)
        val txtFilipino:EditText = findViewById(R.id.txtFilipino)
        val lblResult:TextView = findViewById(R.id.lblResult)
        val imageView:ImageView = findViewById(R.id.imageView)

        btn.setOnClickListener(){
            val mathGrade:String = txtMath.text.toString()
            val scienceGrade = txtScience.text.toString()
            val filipinoGrade = txtFilipino.text.toString()

            val total = mathGrade.toFloat() + scienceGrade.toFloat() + filipinoGrade.toFloat()
            val average = total / 3
            lblResult.text = "Average: $average"

            if (average>=75){
                imageView.setImageResource(R.drawable.pass)
            }
            else{
                imageView.setImageResource(R.drawable.failed)
            }
        }
    }
}



