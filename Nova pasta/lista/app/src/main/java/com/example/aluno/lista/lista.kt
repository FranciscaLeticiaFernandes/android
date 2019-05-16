package com.example.aluno.lista

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class lista : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
       // setSupportActionBar(toolbar)

        val arraylist =ArrayList<String>()
        arraylist.add("Linha 1")
        arraylist.add("Linha 2")
        arraylist.add("Linha 2")
        arraylist.add("Linha 3")
        arraylist.add("Linha 4")

        val lv: ListView = findViewById(R.id.lista)
        lv.adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                arraylist)

    }
}
