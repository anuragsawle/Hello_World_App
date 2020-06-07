package com.example.helloworldapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_registration_form.*
import kotlin.also as also1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_form)
        MySend.setOnClickListener(fun(it: View) {
                var name=""
                name = Name.text.toString()
                Toast.makeText(applicationContext,name,Toast.LENGTH_SHORT).show()
            var intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("refname", name)
            }
            startActivity(intent)
        })
    }
}