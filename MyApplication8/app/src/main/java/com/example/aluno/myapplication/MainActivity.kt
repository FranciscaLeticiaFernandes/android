package com.example.aluno.myapplication

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin : Button = findViewById<Button>(R.id.btLogin)

        btLogin.setOnClickListener(View.OnClickListener { it: View!
          val textViewLogin: TextView = findViewById<TextView>(R.etUserName) as TextView
          toast (textViewLogin.text)})

    }

}
