package com.example.ispisbrojeva

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var br1 : Button
    lateinit var br2 : Button
    lateinit var br3 : Button
    lateinit var br4 : Button
    lateinit var br5 : Button
    lateinit var br6 : Button
    lateinit var br7 : Button
    lateinit var br8 : Button
    lateinit var br9 : Button
    lateinit var br0 : Button
    lateinit var del : Button
    lateinit var dot : Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        br1 = findViewById(R.id.button1)
        br2 = findViewById(R.id.button2)
        br3 = findViewById(R.id.button3)
        br4 = findViewById(R.id.button4)
        br5 = findViewById(R.id.button5)
        br6 = findViewById(R.id.button6)
        br7 = findViewById(R.id.button7)
        br8 = findViewById(R.id.button8)
        br9 = findViewById(R.id.button9)
        br0 = findViewById(R.id.button0)
        del = findViewById(R.id.buttonDel)
        dot = findViewById(R.id.buttonDot)
        result = findViewById(R.id.result)

        result.setText("");

        br1.setOnClickListener {
            result.text = result.text.toString() + "1"
        }
        br2.setOnClickListener {
            result.text = result.text.toString() + "2"
        }
        br3.setOnClickListener {
            result.text = result.text.toString() + "3"
        }
        br4.setOnClickListener {
            result.text = result.text.toString() + "4"
        }
        br5.setOnClickListener {
            result.text = result.text.toString() + "5"
        }
        br6.setOnClickListener {
            result.text = result.text.toString() + "6"
        }
        br7.setOnClickListener {
            result.text = result.text.toString() + "7"
        }
        br8.setOnClickListener {
            result.text = result.text.toString() + "8"
        }
        br9.setOnClickListener {
            result.text = result.text.toString() + "9"
        }
        br0.setOnClickListener {
            result.text = result.text.toString() + "0"
        }
        dot.setOnClickListener {
            result.text = result.text.toString() + "."
        }
        del.setOnClickListener {
            result.setText("")
        }

    }
}