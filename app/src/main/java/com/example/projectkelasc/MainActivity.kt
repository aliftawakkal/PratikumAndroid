package com.example.projectkelasc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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
            var alert:AlertDialog.Builder = AlertDialog.Builder(this)
            val editUser = EditText(this)
            alert.setTitle("Username")
            alert.setMessage("Hai")
            alert.setView(editUser)


            alert.setPositiveButton("Yes"){dialog, which ->
                var username = editUser.text.toString()
                val intent = Intent( this@MainActivity,GameActivity::class.java)
                intent.putExtra(GameActivity.EXTRA_USER, username)
                startActivity(intent)
            }

            alert.setNegativeButton("No"){dialog, which ->

            }

            alert.show()


        }
    }
}
