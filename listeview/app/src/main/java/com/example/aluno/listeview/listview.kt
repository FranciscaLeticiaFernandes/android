package com.example.aluno.listeview

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_listview.*

class listview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            view
            Snackbar.make(view "Replace with your own action", Snackbar.LENGTH_LONG)

            .setAction("Action", null).show()
        }

        var listview = findViewById<ListView>(R.id.listview1)
        val arrayDeLinhas:ArrayList<String> = ArrayList<String>()
        arrayDeLinhas.add("Primaeira Linha...")
        arrayDeLinhas.add("Segunda linha ....")
        arrayDeLinhas.add("Quarta Linha...")
        arrayDeLinhas.add("Sexta Linha...")
        listview.adapter = ArrayAdapter( this, android.R.layout.simple_expandable_list_item_1,arrayDeLinhas)

    }

}