package com.example.aluno.tela

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.toast

class telalogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telalogin)
        val btlogin: Button = findViewById<Button>(R.id.button)

        btlogin.setOnClickListener (View.OnClickListener{
            val textViewLogin: TextView = findViewById<TextView>(R.id.username) as TextView
            toast(textViewLogin.text)
            val textViewSenha: TextView = findViewById<TextView>(R.id.password) as TextView

            val loginResult: Boolean = AppStaticServices.login(
                    textViewLogin.text.toString(),
                    textViewSenha.text.toString())


            if (loginResult == true) {
                toast("Login realizado com Sucesso")
            } else {
                toast("Usuário ou Senha Incorretos")
            }
        })

    }
}
