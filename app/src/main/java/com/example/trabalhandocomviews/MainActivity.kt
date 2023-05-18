package com.example.trabalhandocomviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meuTextView = findViewById<TextView>(R.id.meuIdDeRecuperacao)
        val meuBotao = findViewById<Button>(R.id.meuIdDoBotao)

        meuTextView.text = "texto programatico"

        meuBotao.setOnClickListener {
            if (meuTextView.isVisible) {
                meuTextView.visibility = View.GONE
            } else {
                meuTextView.visibility = View.VISIBLE
            }
        }
    }
}