package com.example.projectkelasc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView1 = findViewById<TextView>(R.id.textView1)
//        val button1 = findViewById<Button>(R.id.button1)

        textView1.setOnClickListener {
            Toast.makeText(this, "Hai",Toast.LENGTH_SHORT ).show()
        }

        button1.setOnClickListener {
            val intent = Intent( this@MainActivity,HitungActivity::class.java)
            startActivity(intent)
        }

        buttonGunting.setOnClickListener {
            val intent = Intent( this@MainActivity,GameActivity::class.java)
            startActivity(intent)
        }
    }
}
