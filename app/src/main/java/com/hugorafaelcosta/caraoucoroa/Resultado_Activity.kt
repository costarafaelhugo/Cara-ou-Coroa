package com.hugorafaelcosta.caraoucoroa

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import java.util.*

class Resultado_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val image = findViewById<ImageView>(R.id.image_moeda)

        val numero = Random().nextInt(2)

        if (numero == 0) {
            image.setImageResource(R.drawable.moeda_coroa)
        } else {
            image.setImageResource(R.drawable.moeda_cara)
        }

    }

    fun voltar(view: android.view.View) {
        finish()
    }

}