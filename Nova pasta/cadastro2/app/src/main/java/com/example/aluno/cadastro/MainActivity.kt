package com.example.aluno.cadastro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val incluir: Button = findViewById<Button>(R.id.incluir)

        incluir.setOnClickListener(View.OnClickListener {
            val txtnome: TextView = findViewById<TextView>(R.id.nome) as TextView
            //val txtpnome: TextView = findViewById<TextView>(R.id.pnome)as TextView
            val txtemail: TextView = findViewById<TextView>(R.id.email)
            val txtlogin: TextView = findViewById<TextView>(R.id.login) as TextView
            val txtsenha : TextView = findViewById<TextView>(R.id.senha) as TextView

            val infocad: Boolean = Cadclass.login(
                    txtnome.text.toString(),
                    txtsenha.text.toString())


        })

        val limpar:Button= findViewById<Button>(R.id.limpar) as TextView

        limpar.setOnClickListener(View.OnClickListener {
            val txtnome: TextView = findViewById<TextView>(R.id.nome) as TextView
            val txtemail: TextView = findViewById<TextView>(R.id.email)
            val txtlogin: TextView = findViewById<TextView>(R.id.login) as TextView
            val txtsenha : TextView = findViewById<TextView>(R.id.senha) as TextView

            val cleanfun: Boolean=cadclass.

        })
    }
}
