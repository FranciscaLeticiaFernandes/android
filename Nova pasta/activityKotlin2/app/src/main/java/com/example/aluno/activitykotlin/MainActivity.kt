package com.example.aluno.activitykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener{ View
            Snackbar .make(View text:"replace with your own action",Snackbar.LENGTH_LONG)
               .setAction{text "Action",listener null).show()
            }

            var listView=findViewById<Listview>(R.id.listview)

            )
        }
    }
}
