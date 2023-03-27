package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityInfo : AppCompatActivity() {
    var name: String? = null
    var pass: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val infoMessage=findViewById<TextView>(R.id.info)
        val btnSalir: Button = findViewById(R.id.btnSalir)
        btnSalir.setOnClickListener { onClick() }

        var miBundle: Bundle? = this.intent.extras

        if (miBundle != null){
            name=miBundle.getString("user")
            pass = miBundle.getString("pass")
        }
        infoMessage!!.text= "User: $name \nPassword: $pass"

    }

    private fun onClick(){
        finish()
    }
}