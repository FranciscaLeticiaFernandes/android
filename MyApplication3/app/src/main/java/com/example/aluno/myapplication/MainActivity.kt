package com.example.aluno.myapplication

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import org.jetbrains.anko.toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btlogin : Button = findViewById<Button>(R.id.btlogin)

        btlogin.setOnClickListener (View.onClickListener{
            val textViewLogin: TextView =findViewById<TextView>(R.id.etUserName) as TextView
            toast (TextViewLogin.text)
            val textViewSenha: TextView =findViewById<TextView>(R.id.epSenha) as TextView

            val:loginResult: boolean = AppStaticServices.login(
                textViewLogin.text.toString(),
                textViewSenha.text.toString())


            if (loginResult ==true){
                toast("Login realizado com Sucesso")
            }else {
                toast("Usuário ou Senha Incorretos")
            }
        })

    }
