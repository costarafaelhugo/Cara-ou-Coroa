package com.hugorafaelcosta.caraoucoroa

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jogar(view: android.view.View) {
        val intent = Intent(applicationContext, Resultado_Activity::class.java)
        startActivity(intent)

    }
}